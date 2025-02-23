package com.kk.order.center.strategy.create;

import com.kk.order.center.entity.Order;
import com.kk.order.center.enums.OrderPlatformEnum;

/**
 * @author Zal
 */
public class OrderCreateStrategyFactory {

    public static OrderCreateStrategy getStrategy(Order order) {
        if (OrderPlatformEnum.MP.getCode() == 1) {
            return new WxMpOrderCreateStrategyImpl();
        } else {
            return new DefaultOrderCreateStrategyImpl();
        }
    }

}
