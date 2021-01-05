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
@ApiModel(value="Package对象", description="产品表")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "产品ID")
    private Integer id;

    /**
     * 二级域名
     */
    @TableField("SecondaryDirectory")
    @ApiModelProperty(value = "二级域名")
    private String secondarydirectory;

    /**
     * 地区
     */
    @ApiModelProperty(value = "地区")
    private String region;

    /**
     * 语言
     */
    @ApiModelProperty(value = "语言")
    private String language;

    /**
     * 产品名称
     */
    @ApiModelProperty(value = "产品名称")
    private String name;

    /**
     * 产品外文名称
     */
    @ApiModelProperty(value = "产品外文名称")
    @TableField("ForeignNames")
    private String foreignnames;

    /**
     * seo标题
     */
    @ApiModelProperty(value = "seo标题")
    @TableField("seoTitle")
    private String seotitle;

    /**
     * seo描述
     */
    @ApiModelProperty(value = "seo描述")
    @TableField("seoDescribe")
    private String seodescribe;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格")
    private Double price;

    /**
     * 原价
     */
    @ApiModelProperty(value = "原价")
    @TableField("originalPrice")
    private Double originalprice;

    /**
     * 折扣
     */
    @ApiModelProperty(value = "折扣")
    private Double discount;

    /**
     * 标签
     */
    @ApiModelProperty(value = "标签")
    private String label;

    /**
     * 1表示(paypal)2表示(SecurityPay)3(货到付款 )
     */
    @ApiModelProperty(value = "1表示(paypal)2表示(SecurityPay)3(货到付款 )")
    private Integer payment;

    /**
     * 销量
     */
    @ApiModelProperty(value = "销量")
    private Integer sales;

    /**
     * 库存
     */
    @ApiModelProperty(value = "库存")
    private Integer inventory;

    /**
     * 联系邮箱
     */
    @ApiModelProperty(value = "联系邮箱")
    private String email;

    /**
     * pop800 id
     */
//    @ApiModelProperty(value = "二级域名")
    private Integer pop;

    /**
     * 缩略图
     */
//    @ApiModelProperty(value = "缩略图")
    private String thumbnail;

    /**
     * FB通用像素id
     */
//    @ApiModelProperty(value = "FB通用像素id")
    @TableField("FBid")
    private String fbid;

//    @ApiModelProperty(value = "二级域名")
    private String description;


}
