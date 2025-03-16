package com.kk.order.center.remote.impl;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.enums.OrderPlatformEnum;
import com.kk.order.center.remote.CashierOrderRemote;
import com.kk.order.center.strategy.create.OrderCreateStrategyFactory;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class CashierOrderRemoteImpl implements CashierOrderRemote {

    @Override
    public OrderDto createOrder(OrderCreateReqDto reqDto) {
        return OrderCreateStrategyFactory.getStrategy(OrderPlatformEnum.CASHIER).createOrder(reqDto);
    }

}
