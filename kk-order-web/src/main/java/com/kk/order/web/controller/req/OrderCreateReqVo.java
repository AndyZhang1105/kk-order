package com.kk.order.web.controller.req;

import com.kk.order.center.dto.req.OrderItemCreateReqDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderCreateReqVo implements Serializable {

    @Schema(description = "订单编号")
    String orderNo;

    @Schema(description = "订单编号")
    @NotEmpty(message = "订单明细不能为空")
    List<OrderItemCreateReqDto> itemList;

}
