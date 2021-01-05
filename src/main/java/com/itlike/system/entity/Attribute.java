package com.itlike.system.entity;

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
@ApiModel(value="Attribute对象", description="属性表")
public class Attribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性组id
     */
    @TableId(value = "attributeId", type = IdType.AUTO)
    @ApiModelProperty(value = "属性组id")
    private Integer attributeid;

    /**
     * 属性名称
     */
    @TableField("AttributeGroup")
    @ApiModelProperty(value = "属性名称")
    private String attributegroup;

    /**
     * 属性价格
     */
    @ApiModelProperty(value = "属性价格")
    private String price;

    /**
     * 图片
     */
    @ApiModelProperty(value = "图片")
    private String picture;

    /**
     * 产品id
     */
    @ApiModelProperty(value = "产品id")
    @TableField("productId")
    private Integer productid;


}
