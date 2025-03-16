package com.kk.order.center.dto.req;

import lombok.Data;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author Zal
 */
@Data
public class OrderItemCreateReqDto implements Serializable {

    @Schema(description = "租户id")
    Long tenantId;

    @Schema(description = "订单编号")
    String orderNo;

    @Schema(description = "商品序号")
    Integer productSeq;

    @Schema(description = "商品upc")
    String productUpc;

    @Schema(description = "商品数量")
    String quantity;
}
