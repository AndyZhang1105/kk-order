package com.kk.order.center.strategy.create;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;

/**
 * @author Zal
 */
public interface OrderCreateStrategy {

    OrderDto createOrder(OrderCreateReqDto orderCreateReqDto);

}
