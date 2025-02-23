package com.kk.order.center.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kk.order.center.entity.BaseEntity;
import com.kk.order.center.entity.BaseEntity;
import java.math.BigDecimal;
import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 订单中心 - 订单明细表
 *
 * @author Zal
 * @since 2025-02-23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("o_order_item")
@Schema(name = "OrderItem", description = "订单中心 - 订单明细表")
public class OrderItem extends BaseEntity {

    @Schema(description = "自增主键id")
    private Long id;

    @Schema(description = "门店id")
    private Long storeId;

    @Schema(description = "订单编号")
    private String orderNo;

    @Schema(description = "商品明细序号,由小到大")
    private Integer productSeq;

    @Schema(description = "商品类型:0：普通商品1：购物袋2：生鲜商品计重3：生鲜商品计件")
    private Integer productType;

    @Schema(description = "商品ID")
    private Long productId;

    @Schema(description = "规格国际条码")
    private String productUpc;

    @Schema(description = "商品编码")
    private String productCode;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "第三方商品编码")
    private String thirdProductCode;

    @Schema(description = "规格ID")
    private Long skuId;

    @Schema(description = "规格名称")
    private String skuName;

    @Schema(description = "商品原单价")
    private BigDecimal originalPrice;

    @Schema(description = "商品单价,销售显示的价格")
    private BigDecimal sellPrice;

    @Schema(description = "商品会员价")
    private BigDecimal memberPrice;

    @Schema(description = "购买数量")
    private BigDecimal quantity;

    @Schema(description = "商品优惠金额")
    private BigDecimal productDiscount;

    @Schema(description = "营销活动优惠金额")
    private BigDecimal activityDiscount;

    @Schema(description = "优惠券优惠金额")
    private BigDecimal couponDiscount;

    @Schema(description = "会员优惠金额")
    private BigDecimal memberDiscount;

    @Schema(description = "用户侧成交金额")
    private BigDecimal userPaySubtotal;

    @Schema(description = "营销活动ID")
    private Long activityId;

    @Schema(description = "营销活动类型")
    private Integer activityType;

    @Schema(description = "商品属性，多个属性用英文逗号隔开")
    private String productProperty;

    @Schema(description = "单位")
    private String unit;

    @Schema(description = "商品品牌名称")
    private String brandName;

    @Schema(description = "商品所属分类大类名称")
    private String bigCategoryName;

    @Schema(description = "商品所属分类小类名称")
    private String smallCategoryName;

    @Schema(description = "商品图片URL")
    private String productImageUrl;

    @Schema(description = "商品重量")
    private BigDecimal productWeight;

    @Schema(description = "商品标签,多个用逗号分隔")
    private String productTag;

    @Schema(description = "下单商品奖励积分")
    private BigDecimal rewardPoints;

    @Schema(description = "是否组合商品")
    private Integer isGroupProduct;

    @Schema(description = "赠品归属订单明细seq，多个用英文逗号隔开")
    private String giftParentSeq;

    @Schema(description = "规格单位与库存单位转换比")
    private BigDecimal conversionRatio;
}
