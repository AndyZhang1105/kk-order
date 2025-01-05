package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum RefundSceneEnum {

    COMPLETE_BEFORE(1, "完成前退款/取消"),
    COMPLETE_AFTER(2, "完成后退款"),

    UNKNOWN(9, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static RefundSceneEnum getByCode(int code) {
        for (RefundSceneEnum aEnum : RefundSceneEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return RefundSceneEnum.UNKNOWN;
    }

}
