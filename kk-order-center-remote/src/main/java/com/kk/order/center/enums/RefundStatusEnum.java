package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum RefundStatusEnum {

    APPROVING(1, "退款待审核中"),
    REJECTED(2, "已拒绝"),
    REFUNDING(3, "退款中"),
    COMPLETED(4, "退款完成"),
    FAILED(5, "退款失败"),

    UNKNOWN(9, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static RefundStatusEnum getByCode(int code) {
        for (RefundStatusEnum aEnum : RefundStatusEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return RefundStatusEnum.UNKNOWN;
    }

}
