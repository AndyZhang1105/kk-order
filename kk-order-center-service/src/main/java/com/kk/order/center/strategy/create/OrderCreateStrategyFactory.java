package com.kk.order.center.strategy.create;

import com.google.common.collect.Maps;
import com.kk.arch.dubbo.common.conf.ApplicationContextHelper;
import com.kk.order.center.enums.OrderPlatformEnum;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author Zal
 */
@Component("orderCreateStrategyFactory")
public class OrderCreateStrategyFactory {

    @Autowired
    private List<OrderCreateStrategy> strategyList;

    private static Map<OrderPlatformEnum, OrderCreateStrategy> strategyMap = Maps.newHashMap();

    @PostConstruct
    public void postConstruct() {
        for (OrderCreateStrategy strategy : strategyList) {
            OrderPlatformEnum orderPlatformEnum = strategy.getOrderPlatformEnum();
            if (orderPlatformEnum == null) {
                continue;
            }
            strategyMap.put(orderPlatformEnum, strategy);
        }
    }

    /**
     * 获取策略
     */
    public static OrderCreateStrategy getStrategy(OrderPlatformEnum orderPlatformEnum) {
        return Optional.ofNullable(strategyMap.get(orderPlatformEnum)).orElse(strategyMap.get(OrderPlatformEnum.UNKNOWN));
    }

}
