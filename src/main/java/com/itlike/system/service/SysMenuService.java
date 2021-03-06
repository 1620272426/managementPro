package com.itlike.system.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.itlike.system.entity.SysMenu;
import com.itlike.system.entity.TreeVo;
import com.itlike.system.entity.query.RoleMenuQuery;
import com.itlike.system.entity.query.RoleMenuTreeQuery;

import java.util.List;

/**
 * <p>
 * 菜单信息表 服务类
 * </p>
 *
 * @author ZYQ
 * @since 2020-12-22
 */
public interface SysMenuService extends IService<SysMenu> {
    //递归查询
    List<SysMenu> queryList();
    //根据用户id
    List<SysMenu> selectPermissionByUserId(Long userId);
    //根据角色id
    List<SysMenu> findByRoleId(Long roleId);
    //递归查询
    public  List<SysMenu> makeTree(List<SysMenu> menuList,Long pid);

    List<TreeVo> Menu();

    int removeByChiId(Long menuId);

    SysMenu getInfo(Long menuId);

    int saveAssignRole(RoleMenuTreeQuery query);

    List<TreeVo> MenuTree(RoleMenuQuery query);
}
