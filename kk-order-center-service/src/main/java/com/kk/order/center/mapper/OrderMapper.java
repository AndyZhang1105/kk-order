package com.kk.order.center.mapper;

import com.kk.order.center.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单主表 Mapper 接口
 * </p>
 *
 * @author Zal
 * @since 2025-02-23
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
