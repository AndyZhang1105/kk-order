package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */
@AllArgsConstructor
@Getter
public enum OrderSourceEnum {

    OF(1, "线下收银台"),
    MP(2, "微信小程序"),
    MT(3, "美团闪购"),
    EL(4, "饿百零售"),
    JD(5, "京东到家"),
    DY(6, "抖音小时达"),

    UNKNOWN(-1, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static OrderSourceEnum getByCode(int code) {
        for (OrderSourceEnum aEnum : OrderSourceEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return OrderSourceEnum.UNKNOWN;
    }

}
