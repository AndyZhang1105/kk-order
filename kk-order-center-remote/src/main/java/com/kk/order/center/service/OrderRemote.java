package com.kk.order.center.service;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;

/**
 * @author Zal
 */
public interface OrderRemote {

    OrderDto createOrder(OrderCreateReqDto orderCreateReqDto);

}
