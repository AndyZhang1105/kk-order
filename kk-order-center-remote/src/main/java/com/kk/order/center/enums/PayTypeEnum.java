package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum PayTypeEnum {

    CASH(1, "现金"),
    WECHAT(2, "微信"),
    ALI(3, "支付宝"),
    UNION(4, "银联"),
    QUICK(5, "云闪付"),
    BALANCE(6, "会员余额"),
    POINTS(7, "会员积分抵现"),

    UNKNOWN(9, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static PayTypeEnum getByCode(int code) {
        for (PayTypeEnum aEnum : PayTypeEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return PayTypeEnum.UNKNOWN;
    }

}
