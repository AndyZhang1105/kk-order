package com.kk.order.center.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kk.order.center.entity.BaseEntity;
import com.kk.order.center.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 
 *
 * @author Zal
 * @since 2025-02-23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("o_order_relation")
@Schema(name = "OrderRelation", description = "")
public class OrderRelation extends BaseEntity {

    @Schema(description = "主键自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "关系类型，0兄弟订单，1子订单")
    private Integer relationType;

    @Schema(description = "关联订单号")
    private String relationOrderNo;

    @Schema(description = "订单号")
    private String orderNo;
}
