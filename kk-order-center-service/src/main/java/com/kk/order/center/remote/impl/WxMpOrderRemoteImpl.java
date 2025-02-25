package com.kk.order.center.remote.impl;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.entity.Order;
import com.kk.order.center.enums.OrderPlatformEnum;
import com.kk.order.center.remote.WxMpOrderRemote;
import com.kk.order.center.strategy.create.OrderCreateStrategy;
import com.kk.order.center.strategy.create.OrderCreateStrategyFactory;

/**
 * @author Zal
 */
public class WxMpOrderRemoteImpl implements WxMpOrderRemote {

    @Override
    public OrderDto createOrder(OrderCreateReqDto reqDto) {
        return OrderCreateStrategyFactory.getStrategy(OrderPlatformEnum.MP).createOrder(reqDto);
    }

    @Override
    public OrderDto payOrder(OrderCreateReqDto reqDto) {
        return null;
    }

    @Override
    public OrderDto cancelOrder(OrderCreateReqDto reqDto) {
        return null;
    }

    @Override
    public OrderDto acceptOrder(OrderCreateReqDto reqDto) {
        return null;
    }

    @Override
    public OrderDto refundOrder(OrderCreateReqDto reqDto) {
        return null;
    }
}
