package com.kk.order.center.remote;

import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;

/**
 * @author Zal
 * @descrition 美团外卖订单
 */
public interface MtOrderRemote {

    OrderDto createOrder(OrderCreateReqDto orderCreateReqDto);

}
