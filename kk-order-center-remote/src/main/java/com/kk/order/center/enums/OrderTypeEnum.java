package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum OrderTypeEnum {

    REAL_TIME(1, "实时订单"),
    GROUP_BUY(2, "拼团订单"),
    SCHEDULED(3, "预约订单"),
    PRE_SALE(4, "预售订单"),
    LOGISTICS(5, "物流订单"),
    POINTS_EXCHANGE(6, "积分兑换订单"),
    COUPON_PACKAGE(7, "券包订单"),
    RECHARGE(8, "会员储值订单"),
    VIRTUAL_GOODS(9, "虚拟商品订单"),

    UNKNOWN(-1, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static OrderTypeEnum getByCode(int code) {
        for (OrderTypeEnum aEnum : OrderTypeEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return OrderTypeEnum.UNKNOWN;
    }

}
