package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum RefundTypeEnum {

    FULL(1, "整单退"),
    PART(2, "部分退"),
    REST_FULL(3, "剩余全部退"),

    UNKNOWN(-1, "未知");

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
