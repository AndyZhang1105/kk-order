package com.kk.order.center.strategy.create;

import com.kk.arch.common.conf.RedisHelper;
import com.kk.arch.common.util.AssertUtils;
import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.entity.Order;
import com.kk.order.center.enums.OrderPlatformEnum;
import com.kk.order.center.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

import static com.kk.arch.common.constant.CommonConstants.TIME_30S;

/**
 * @author Zal
 */
@Component("defaultOrderCreateStrategy")
@Slf4j
public class DefaultOrderCreateStrategyImpl extends AbstractOrderCreateStrategyImpl {

    @Override
    public OrderDto createOrder(OrderCreateReqDto reqDto) {
        return super.createOrder(reqDto);
    }

    @Override
    public OrderPlatformEnum getOrderPlatformEnum() {
        return OrderPlatformEnum.UNKNOWN;
    }

}
