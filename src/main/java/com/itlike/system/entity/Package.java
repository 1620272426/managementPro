package com.itlike.system.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author linlin
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Package对象", description="套餐表")
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 套餐id
     */
    @TableId(value = "packageId", type = IdType.AUTO)
    @ApiModelProperty(value = "套餐id")
    private Integer packageid;

    /**
     * 套餐名称
     */
    @ApiModelProperty(value = "套餐名称")
    private String name;

    /**
     * 套餐价格
     */
    @ApiModelProperty(value = "套餐价格")
    private Double price;

    /**
     * 套餐图片
     */
    @ApiModelProperty(value = "套餐图片")
    private String picture;

    /**
     * 产品名称
     */
    @ApiModelProperty(value = "产品名称")
    @TableField("productName")
    private String productname;

    /**
     * 产品外文名称
     */
    @ApiModelProperty(value = "产品外文名称")
    private String names;

    /**
     * 	产品数量
     */
    @ApiModelProperty(value = "产品数量")
    private Integer number;

    /**
     * 产品id
     */
    @ApiModelProperty(value = "产品id")
    @TableField("productId")
    private Integer productid;


}
