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
@ApiModel(value="Atlas对象", description="图集表")
public class Atlas implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图集ID
     */
    @TableId(value = "atlasId", type = IdType.AUTO)
    @ApiModelProperty(value = "图集ID")
    private Integer atlasid;

    /**
     * 产品ID
     */
    @TableField("productId")
    @ApiModelProperty(value = "产品ID")
    private Integer productid;

    /**
     * 图集地址
     */
    @TableField("atlasAddress")
    @ApiModelProperty(value = "图集地址")
    private String atlasaddress;


}
