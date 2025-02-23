package com.kk.order.center.service.impl;

import com.kk.order.center.entity.Order;
import com.kk.order.center.mapper.OrderMapper;
import com.kk.order.center.service.OrderService;
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
