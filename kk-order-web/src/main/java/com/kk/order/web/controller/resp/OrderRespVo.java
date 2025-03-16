package com.kk.order.web.controller.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRespVo implements Serializable {

    @Schema(description = "订单编号")
    String orderNo;

}
