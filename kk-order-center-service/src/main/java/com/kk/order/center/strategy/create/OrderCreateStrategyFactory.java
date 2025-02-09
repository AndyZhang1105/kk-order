package com.kk.order.center.strategy.create;

/**
 * @author Zal
 */
public class OrderCreateStrategyFactory {

    public static OrderCreateStrategy getStrategy(Order order) {
        if (order.getPaymentMethod() == PaymentMethod.ONLINE) {
            return new WxMpOrderCreateStrategyImpl();
        } else {
            return new DefaultOrderCreateStrategyImpl();
        }
    }

}
