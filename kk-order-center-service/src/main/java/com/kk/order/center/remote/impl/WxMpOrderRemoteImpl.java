package com.kk.order.center.remote.impl;

import com.kk.order.center.remote.WxMpOrderRemote;
import com.kk.order.center.strategy.create.OrderCreateStrategy;
import com.kk.order.center.strategy.create.OrderCreateStrategyFactory;

/**
 * @author Zal
 */
public class WxMpOrderRemoteImpl implements WxMpOrderRemote {

    public void createOrder(Order order) {
        OrderCreateStrategy strategy = OrderCreateStrategyFactory.getStrategy(order);
        strategy.createOrder(order);
    }

}
