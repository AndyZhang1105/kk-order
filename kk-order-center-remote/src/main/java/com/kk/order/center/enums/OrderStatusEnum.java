package com.kk.order.center.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zal
 */

@AllArgsConstructor
@Getter
public enum OrderStatusEnum {

    UNPAID(10, "待支付"),
    UNPAID_WAITING(1001, "等待买家付款"),
    UNPAID_PARTIAL(1002, "部分已付款"),
    UNPAID_TIMEOUT(1003, "支付超时"),
    UNPAID_FAIL(1004, "支付失败"),
    UNPAID_HANDLING(1005, "支付处理中"),

    UNACCEPTED(11, "待接单"),
    UNACCEPTED_WAITING(1101, "等待商家接单"),

    UNPREPARED(12, "待备货"),
    UNPREPARED_WAITING(1201, "待备货"),
    UNPREPARED_AGAIN(1202, "待备货-再次提醒"),

    PICKING(13, "拣货中"),
    PICKING_GOODS(1301, "商家拣货中"),
    PICKING_PACKAGING(1302, "打包中"),
    PICKING_PACKAGED(1303, "打包完成"),

    DISPATCH(14, "派单中"),
    DISPATCH_WAITING_RIDER(1401, "骑手抢单中"),
    DISPATCH_EXCEPTION(1402, "派单异常"),
    DISPATCH_RIDER_RECEIVED(1403, "骑手已接单"),

    TAKEOFF(15, "待取货"),
    TAKEOFF_WAITING_CUSTOMER(1501, "等待客户取货"),
    TAKEOFF_WAITING_RIDER(1502, "等待骑手取货"),
    TAKEOFF_EXCEPTION(1503, "取货异常"),

    DELIVERY(16, "配送中"),
    DELIVERY_EXPRESS(1601, "快递配送中"),
    DELIVERY_AGAIN(1602, "待再投"),
    DELIVERY_EXCEPTION(1603, "订单异常"),
    DELIVERY_LOCKED(1604, "订单锁定"),
    DELIVERY_UNLOCKED(1605, "订单解锁"),
    DELIVERY_RIDER(1606, "骑手配送中"),

    COMPLETED(17, "已完成"),
    COMPLETED_DELIVERY(1701, "商家妥投"),
    COMPLETED_AUTO(1702, "自动完成"),
    COMPLETED_CUSTOMER(1703, "用户确认收货"),

    PAID(20, "已支付"),
    PAID_GROUPING(2001, "拼团中"),

    CANCELLED(18, "已取消"),
    CANCELLED_BY_CUSTOMER(1801, "用户未支付取消"),
    CANCELLED_BY_TIMEOUT_PAY(1802, "用户未支付超时系统自动取消"),
    CANCELLED_BY_MERCHANT(1803, "商家拒单"),
    CANCELLED_BY_TIMEOUT_ACCEPT(1804, "商家超时未接单取消"),
    CANCELLED_BY_REJECT_GOODS(1805, "履约配送后，用户拒收"),
    CANCELLED_BY_OTHER_REASON(1806, "其他原因取消订单"),
    CANCELLED_BY_PLATFORM(1807, "平台取消订单"),
    CANCELLED_BEFORE_DELIVERY(1808, "用户发货前取消"),
    CANCELLED_AFTER_DELIVERY(1809, "用户收货前取消"),
    CANCELLED_BEFORE_CUTOFF(1810, "未截单取消"),
    CANCELLED_AFTER_CUTOFF(1811, "已截单取消"),

    REFUND(19, "退款"),
    REFUND_WAITING(1901, "退款审核中"),
    REFUND_QUICK_CANCEL(1902, "急速退款取消订单"),
    REFUND_AGREED(1903, "商家同意取消订单"),
    REFUND_COMPLETED(1904, "已退款"),
    REFUND_BEFORE_COMPLETED(1905, "完成前退款"),
    REFUND_AFTER_COMPLETED(1906, "完成后退款"),
    REFUND_GOODS_WAITING(1921, "等待货物退回中"),
    REFUND_PARTIAL_COMPLETED(1922, "部分退款完成"),
    REFUND_ONCE_COMPLETED(1923, "一次性全部退款完成"),
    REFUND_REST_COMPLETED(1924, "剩余全部退款完成"),
    REFUND_DELIVERY_HANDLING(1925, "补送处理中"),
    REFUND_DELIVERY_DONE(1926, "补送完成"),
    REFUND_COMPLAINT_HANDLING(1927, "投诉处理中"),
    REFUND_COMPLAINT_DONE(1928, "投诉处理完成"),

    UNKNOWN(-1, "未知");

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
