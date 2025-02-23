package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 * @descrition 平台类型 1:美团 2:饿了么 3:京东到家 4:饿百零售 5:微商城 6:收银台
 */
@AllArgsConstructor
@Getter
public enum OrderPlatformEnum {

    MT(1, "美团"),
    ELM(2, "饿了么"),
    JD(3, "京东到家"),
    EB(4, "饿百零售"),
    MP(5, "微商城"),
    CASHIER(6, "收银台"),

    UNKNOWN(-1, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static OrderPlatformEnum getByCode(int code) {
        for (OrderPlatformEnum aEnum : OrderPlatformEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return OrderPlatformEnum.UNKNOWN;
    }

}
