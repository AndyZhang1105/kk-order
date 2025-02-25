package com.kk.order.center.strategy.create;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.enums.OrderPlatformEnum;

/**
 * @author Zal
 */
public interface OrderCreateStrategy {

    /**
     * 创建订单
     * @param reqDto
     * @return OrderDto
     */
    OrderDto createOrder(OrderCreateReqDto reqDto);

    /**
     * 获取订单平台枚举，每一个策略对应一个订单平台
     * @return
     */
    OrderPlatformEnum getOrderPlatformEnum();

}
