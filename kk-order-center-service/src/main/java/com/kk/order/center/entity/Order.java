package com.kk.order.center.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kk.order.center.entity.BaseEntity;
import com.kk.order.center.entity.BaseEntity;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 订单主表
 *
 * @author Zal
 * @since 2025-02-23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("o_order")
@Schema(name = "Order", description = "订单主表")
public class Order extends BaseEntity {

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "订单编号")
    private String orderNo;

    @Schema(description = "第三方订单编号")
    private String thirdOrderNo;

    @Schema(description = "门店ID")
    private Long storeId;

    @Schema(description = "门店名称")
    private String storeName;

    @Schema(description = "平台类型1:美团 2:饿了么 3:京东到家 4:饿百零售 5:微商城 6:扫码购")
    private Integer platformType;

    @Schema(description = "订单类型")
    private Integer orderType;

    @Schema(description = "商品合计金额")
    private BigDecimal productTotal;

    @Schema(description = "商品优惠金额")
    private BigDecimal productDiscount;

    @Schema(description = "活动优惠金额，比如新人立减、满减活动")
    private BigDecimal marketingDiscount;

    @Schema(description = "用券优惠金额")
    private BigDecimal couponDiscount;

    @Schema(description = "会员优惠金额")
    private BigDecimal memberDiscount;

    @Schema(description = "配送费")
    private BigDecimal shippingFee;

    @Schema(description = "包装费")
    private BigDecimal packageFee;

    @Schema(description = "订单总价=商品金额-优惠金额+配送费+包装费")
    private BigDecimal orderTotal;

    @Schema(description = "商家承担优惠金额")
    private BigDecimal merchantBearDiscount;

    @Schema(description = "(第三方)平台承担优惠金额")
    private BigDecimal platformBearDiscount;

    @Schema(description = "商品侧的平台抽成（平台服务费）")
    private BigDecimal platformProductFee;

    @Schema(description = "履约侧的平台抽成（履约服务费）")
    private BigDecimal platformFulfillmentFee;

    @Schema(description = "商家应收金额")
    private BigDecimal merchantReceivableTotal;

    @Schema(description = "品类数")
    private Integer categoryNum;

    @Schema(description = "商品个数")
    private Integer productNum;

    @Schema(description = "用户期望送达时间 例：18:00-18:30")
    private String expectDeliveryTime;

    @Schema(description = "配送方式")
    private Integer shippingType;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "下单用户昵称")
    private String userName;

    @Schema(description = "下单用户手机号")
    private String userMobile;

    @Schema(description = "用户实际支付金额")
    private BigDecimal userPayTotal;

    @Schema(description = "用户下单时间（注意不是创建时间）")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;

    @Schema(description = "订单主状态")
    private Integer orderStatus;

    @Schema(description = "订单子业务状态，系统内部使用")
    private Integer orderBusinessStatus;

    @Schema(description = "0-其他;1-微信;2-支付宝;3-现金;4-余额支付;5-第三方平台(外卖);6-混合支付;7-银联支付;8-积分支付;")
    private Integer payType;

    @Schema(description = "支付状态:0未支付,1部分支付,2:全部支付")
    private Integer payStatus;

    @Schema(description = "订单支付成功时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    @Schema(description = "订单退款状态 0:未申请退款")
    private Integer refundStatus;

    @Schema(description = "已退款金额")
    private BigDecimal refundTotal;

    @Schema(description = "忌口或者备注")
    private String remark;

    @Schema(description = "线下小票流水号")
    private String flowNo;
}
