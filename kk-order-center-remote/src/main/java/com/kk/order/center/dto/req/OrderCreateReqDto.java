package com.kk.order.center.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Zal
 */
@Data
public class OrderCreateReqDto implements Serializable {

    /**
     * 租户id
     */
    @NotNull(message = "租户id")
    Long tenantId;

    /**
     * 订单号
     */
    @NotBlank(message = "订单明细不能为空")
    String orderNo;

    /**
     * 订单项
     */
    @NotEmpty(message = "订单明细不能为空")
    List<OrderItemCreateReqDto> itemList;

}
