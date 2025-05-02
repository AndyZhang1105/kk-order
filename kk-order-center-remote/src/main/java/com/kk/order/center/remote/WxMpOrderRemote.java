package com.kk.order.center.remote;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;

/**
 * @author Zal
 * @descrition 微信小程序的商城订单
 */
public interface WxMpOrderRemote {

    /**
     * 创建订单
     */
    OrderDto createOrder(OrderCreateReqDto orderCreateReqDto);

    OrderDto payOrder(OrderCreateReqDto orderCreateReqDto);

    OrderDto cancelOrder(OrderCreateReqDto orderCreateReqDto);

    OrderDto acceptOrder(OrderCreateReqDto orderCreateReqDto);

    OrderDto refundOrder(OrderCreateReqDto orderCreateReqDto);

}
