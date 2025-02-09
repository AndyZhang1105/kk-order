package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum OrderOperateEnum {


    CREATE(1, "创建"),
    PAY(2, "支付"),
    CANCEL(3, "取消"),
    MODIFY(4, "修改"),
    REFUND(5, "退款"),

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
