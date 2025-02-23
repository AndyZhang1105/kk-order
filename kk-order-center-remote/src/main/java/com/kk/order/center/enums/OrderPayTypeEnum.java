package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 * @descrition 0-其他;1-微信;2-支付宝;3-现金;4-余额支付;5-第三方平台(外卖);6-混合支付;7-银联支付;8-积分支付;
 */
@AllArgsConstructor
@Getter
public enum OrderPayTypeEnum {

    OTHER(0, "其它"),
    WECHAT(1, "微信"),
    ALI(2, "支付宝"),
    CASH(3, "现金"),
    BALANCE(4, "会员余额"),
    THIRD(5, "第三方平台"),
    MIXED(6, "混合"),
    UNION(7, "银联/云闪付"),
    QUICK(8, "积分支付"),

    UNKNOWN(-1, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static OrderPayTypeEnum getByCode(int code) {
        for (OrderPayTypeEnum aEnum : OrderPayTypeEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return OrderPayTypeEnum.UNKNOWN;
    }

}
