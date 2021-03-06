package com.itlike.system.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.ArrayList;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单信息表
 * </p>
 *
 * @author ZYQ
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysMenu对象", description="菜单信息表")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单 ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "父菜单 ID (0为顶级菜单)")
    private Long parentId;

    @ApiModelProperty(value = "菜单名称")
    private String label;

    @ApiModelProperty(value = "授权标识符")
    private String code;

    @ApiModelProperty(value = "路由地址")
    private String path;

    @ApiModelProperty(value = "路由名称")
    private String name;

    @ApiModelProperty(value = "请求地址")
    private String url;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "类型(1目录，2菜单，3按钮)")
    private Integer type;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    @ApiModelProperty(value = "父菜单")
    @TableField(exist = false)
    private String parentName;

    @ApiModelProperty(value = "子菜单集合")
    @TableField(exist = false)
    private List<SysMenu> children=new ArrayList<>();

}
