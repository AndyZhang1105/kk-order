package com.kk.order.center.dto.req;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Zal
 */
@Data
public class OrderItemCreateReqDto implements Serializable {

    Long tenantId;

    String orderNo;
}
