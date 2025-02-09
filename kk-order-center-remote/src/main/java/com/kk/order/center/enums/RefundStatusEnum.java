package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum RefundStatusEnum {

    NONE(0, "未申请退款"),
    USER_APPLY_PART(1, "用户发起部分退款"),
    USER_APPLY_FULL(2, "用户发起全部退款"),
    MERCHANT_APPLY_FULL(3, "商家发起全部退款"),
    APPROVING(4, "商家审核通过"),
    REJECTED(5, "商家审核拒绝"),
    REFUNDING(6, "商家退款处理中"),
    COMPLETED(7, "商家完成退款"),
    FAILED(8, "商家退款失败"),
    CANCELLED(9, "用户取消退款申请"),

    UNKNOWN(-1, "未知");

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
