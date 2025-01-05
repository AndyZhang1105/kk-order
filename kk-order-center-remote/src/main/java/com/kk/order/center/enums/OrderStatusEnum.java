package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */

@AllArgsConstructor
@Getter
public enum OrderStatusEnum {

    UNPAID(1, "未支付"),
    UNPAID_WAITING(10, "等待买家付款"),
    UNPAID_PARTIAL(11, "部分已付款"),
    UNPAID_TIMEOUT(12, "支付超时"),
    UNPAID_FAIL(13, "支付失败"),
    UNPAID_HANDLING(14, "支付处理中"),

    PAID(2, "已支付"),
    PAID_GROUPING(20, "拼团中"),

    CONFIRMED(3, "已确认"),
    CONFIRMED_ACCEPTED(30, "商家确认接单"),
    CONFIRMED_APPROVING(31, "商家人工审核中"),
    CONFIRMED_REJECTED(32, "商家审核拒绝"),

    HANDLING(4, "处理中"),
    HANDLING_PREPARING(40, "商家准备商品中"),
    HANDLING_RIDER_GET(41, "等待骑手取餐"),
    HANDLING_GOODS_PICKING(42, "拣货中"),
    HANDLING_GOODS_PACKAGING(43, "打包中"),
    HANDLING_WAITING_SHIPPING(44, "待发货"),

    DELIVERY(5, "已发货/配送中"),
    DELIVERY_RECEIVED(50, "骑手已接单"),
    DELIVERY_SHIPPING(51, "骑手配送中"),
    DELIVERY_EXPRESS_WAITING(52, "待快递揽件"),
    DELIVERY_EXPRESS_COLLECTED(53, "快递已揽件"),

    COMPLETED(6, "已完成"),
    COMPLETED_ALL(60, "已全部完成"),
    COMPLETED_PARTIAL(61, "已部分完成"),
    COMPLETED_DELIVERY(62, "已妥投"),
    COMPLETED_CONFIRMED(63, "客户确认收货"),

    CANCELLED(7, "已取消"),
    CANCELLED_BY_USER_BEFORE_PAY(70, "用户支付前取消"),
    CANCELLED_BY_USER_AFTER_PAY(71, "用户支付后取消"),
    CANCELLED_BY_MERCHANT(72, "商家取消"),
    CANCELLED_BY_SYSTEM(73, "支付超时系统自动取消"),

    REFUND(8, "退货退款"),
    REFUND_WAITING(80, "售后审核中"),
    REFUND_GOODS_WAITING(81, "等待货物退回中"),
    REFUND_APPROVING(82, "退款审核中"),
    REFUND_PARTIAL_COMPLETED(83, "部分退款完成"),
    REFUND_ONCE_COMPLETED(84, "一次性全部退款完成"),
    REFUND_REST_COMPLETED(85, "剩余全部退款完成"),
    REFUND_DELIVERY_HANDLING(86, "补送处理中"),
    REFUND_DELIVERY_DONE(87, "补送完成"),
    REFUND_COMPLAINT_HANDLING(88, "投诉处理中"),
    REFUND_COMPLAINT_DONE(89, "投诉处理完成"),

    OTHER(9, "特殊状态"),
    UNKNOWN(0, "未知");

    private final int code;
    private final String desc;

    /**
     * 从code值获取对应的枚举
     */
    public static OrderStatusEnum getByCode(int code) {
        for (OrderStatusEnum aEnum : OrderStatusEnum.values()) {
            if (aEnum.getCode() == code) {
                return aEnum;
            }
        }
        return OrderStatusEnum.UNKNOWN;
    }

}
