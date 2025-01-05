package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum ShippingTypeEnum {

    SELF_DELIVERY(1, "商家自送（店员自配）"),
    TAKEOUT_DELIVERY(2, "外卖配送"),
    SELF_PICKUP(3, "到店自提"),
    EXPRESS(4, "快递配送"),
    PICKUP_POINT(5, "提货点自提"),
    THIRD_DELIVERY(6, "三方配送"),
    MYT(7, "麦芽田（聚合配送）"),

    UNKNOWN(9, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static ShippingTypeEnum getByCode(int code) {
        for (ShippingTypeEnum aEnum : ShippingTypeEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return ShippingTypeEnum.UNKNOWN;
    }

}
