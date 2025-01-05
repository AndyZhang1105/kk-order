package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum RefundTypeEnum {

    OF(1, "整单退"),
    VS(2, "部分退"),
    MT(3, "剩余全部退"),

    UNKNOWN(9, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static RefundTypeEnum getByCode(int code) {
        for (RefundTypeEnum aEnum : RefundTypeEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return RefundTypeEnum.UNKNOWN;
    }

}
