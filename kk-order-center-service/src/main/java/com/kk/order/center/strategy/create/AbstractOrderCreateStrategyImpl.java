package com.kk.order.center.strategy.create;

import com.kk.arch.dubbo.common.conf.RedisHelper;
import com.kk.arch.dubbo.common.util.AssertUtils;
import com.kk.arch.dubbo.common.util.JsonUtils;
import com.kk.order.center.conf.MqHelper;
import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.entity.Order;
import com.kk.order.center.entity.OrderItem;
import com.kk.order.center.enums.OrderStatusEnum;
import com.kk.order.center.service.OrderService;
import com.kk.order.center.service.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.kk.arch.dubbo.common.constant.CommonConstants.TIME_30S;

/**
 * @author Zal
 */
@Slf4j
public abstract class AbstractOrderCreateStrategyImpl implements OrderCreateStrategy {

    @Autowired
    private RedisHelper redisHelper;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderItemService orderItemService;

    public void preCreate(OrderCreateReqDto reqDto) {
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public OrderDto createOrder(OrderCreateReqDto reqDto) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        final String lockKey = "LOCK_CREATE_ORDER:" + reqDto.getTenantId() + ":" + reqDto.getOrderNo();
        AssertUtils.isTrue(redisHelper.tryLock(lockKey, UUID.randomUUID().toString(), TIME_30S), "此订单已在创建中，不要重复操作");

        // 1. 前置检查
        this.preCreate(reqDto);

        // 2. 保存订单主体
        Order order = JsonUtils.toObject(reqDto, Order.class);
        final boolean orderSaveResult = orderService.save(order);
        AssertUtils.isTrue(orderSaveResult, "主订单入库失败");

        // 3. 保存订单明细信息
        final List<OrderItem> itemList = JsonUtils.toList(reqDto.getItemList(), OrderItem.class);
        Optional.ofNullable(reqDto.getItemList()).orElse(Collections.emptyList()).forEach(o -> {
            o.setOrderNo(order.getOrderNo());
        });
        final boolean orderItemSaveResult =orderItemService.saveBatch(itemList);
        AssertUtils.isTrue(orderItemSaveResult, "订单明细入库失败");

        // 4. MQ的15分钟延时队列判断付费订单是否取消，非付费订单则直接完成
        if(OrderStatusEnum.UNPAID.getCode() == order.getOrderStatus()) {
            try {
                MqHelper.sendMsg("ORDER_PAY_15S_DELAY_BINDING", order.getOrderNo());
            } catch (Exception e) {
                log.error("创建订单发送15分钟延时队列失败: %s", e);
            }
        }

        // 3. 后置处理
        this.postCreate(reqDto);

        // 6. 耗时打印
        stopWatch.stop();  // 停止计时
        log.info("订单入库成功，耗时: {}ms", stopWatch.getTime());

        return null;
    }

    public void postCreate(OrderCreateReqDto orderCreateReqDto) {
    }

}
