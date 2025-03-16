package com.kk.order.center.strategy.create;

import com.kk.arch.dubbo.common.conf.RedisHelper;
import com.kk.arch.dubbo.common.util.AssertUtils;
import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.enums.OrderPlatformEnum;
import com.kk.order.center.service.OrderService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

import static com.kk.arch.dubbo.common.constant.CommonConstants.TIME_30S;

/**
 * @author Zal
 */
@Component("wxMpOrderCreateStrategy")
@Slf4j
public class WxMpOrderCreateStrategyImpl extends AbstractOrderCreateStrategyImpl {

    @Resource
    private RedisHelper redisHelper;

    @Resource
    private OrderService orderService;

    @Override
    public OrderPlatformEnum getOrderPlatformEnum() {
        return OrderPlatformEnum.MP;
    }

    @Override
    public void preCreate(OrderCreateReqDto reqDto) {
        super.preCreate(reqDto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public OrderDto createOrder(OrderCreateReqDto reqDto) {
        return super.createOrder(reqDto);
    }

    @Override
    public void postCreate(OrderCreateReqDto reqDto) {
        super.postCreate(reqDto);
    }

}
