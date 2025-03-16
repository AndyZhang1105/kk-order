package com.kk.order.web.controller;

import com.kk.arch.dubbo.common.util.JsonUtils;
import com.kk.arch.dubbo.common.util.ResponseUtils;
import com.kk.arch.dubbo.common.util.SnowflakeIdUtils;
import com.kk.order.center.dto.req.OrderCreateReqDto;
import com.kk.order.center.dto.resp.OrderDto;
import com.kk.order.center.remote.CashierOrderRemote;
import com.kk.order.web.controller.req.OrderCreateReqVo;
import com.kk.order.web.controller.resp.OrderRespVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kk.arch.dubbo.remote.vo.ResponseData;

/**
 * @author Zal
 */
@RequestMapping("/order/web/order")
@RestController
@Tag(name = "收银台订单", description = "收银台订单的增删改查接口")
public class CashierOrderController extends BaseController {

    @DubboReference(lazy = true)
    private CashierOrderRemote cashierOrderRemote;

    @PostMapping("/create")
    public ResponseData<OrderRespVo> createOrder(@RequestBody @Validated OrderCreateReqVo reqVo) {
        OrderCreateReqDto reqDto = JsonUtils.toObject(reqVo, OrderCreateReqDto.class);
        reqDto.setOrderNo(String.valueOf(SnowflakeIdUtils.generateId()));
        final OrderDto orderDto = cashierOrderRemote.createOrder(reqDto);
        return ResponseUtils.success(JsonUtils.toObject(orderDto, OrderRespVo.class));
    }

}
