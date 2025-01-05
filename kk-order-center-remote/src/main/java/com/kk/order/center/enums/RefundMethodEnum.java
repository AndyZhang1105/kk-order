package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum RefundMethodEnum {

    APPROVING(1, "退款退货"),
    REJECTED(2, "仅退款"),

    UNKNOWN(9, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static RefundMethodEnum getByCode(int code) {
        for (RefundMethodEnum aEnum : RefundMethodEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return RefundMethodEnum.UNKNOWN;
    }

}
