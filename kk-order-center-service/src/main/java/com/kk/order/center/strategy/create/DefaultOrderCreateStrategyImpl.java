package com.kk.order.center.strategy.create;

import com.kk.arch.dubbo.common.conf.RedisHelper;
import com.kk.arch.dubbo.common.util.AssertUtils;
import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.entity.Order;
import com.kk.order.center.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

import static com.kk.arch.dubbo.common.constant.CommonConstants.TIME_30S;

/**
 * @author Zal
 */
@Service
@Slf4j
public class DefaultOrderCreateStrategyImpl extends AbstractOrderCreateStrategyImpl implements OrderCreateStrategy {

    @Override
    public OrderDto createOrder(OrderCreateReqDto reqDto) {
        return super.createOrder(reqDto);
    }

}
