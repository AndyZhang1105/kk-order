package com.kk.order.center.dto.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Zal
 */
@Data
public class OrderCreateReqDto implements Serializable {

    Long tenantId;

    String orderNo;

    List<OrderItem> itemList;
}
