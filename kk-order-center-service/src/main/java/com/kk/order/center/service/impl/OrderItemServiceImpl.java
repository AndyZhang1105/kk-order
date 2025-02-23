package com.kk.order.center.service.impl;

import com.kk.order.center.entity.OrderItem;
import com.kk.order.center.mapper.OrderItemMapper;
import com.kk.order.center.service.OrderItemService;
import com.kk.order.center.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中心 - 订单明细表 服务实现类
 * </p>
 *
 * @author Zal
 * @since 2025-02-23
 */
@Service
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
