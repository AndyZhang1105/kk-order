package com.kk.marketing.coupon.service.impl;

import com.kk.marketing.coupon.entity.Order;
import com.kk.marketing.coupon.mapper.OrderMapper;
import com.kk.marketing.coupon.service.OrderService;
import com.kk.order.center.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单主表 服务实现类
 * </p>
 *
 * @author Zal
 * @since 2025-02-23
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements OrderService {

}
