package com.xhai.mall.controller;

import com.xhai.mall.dto.CommonResult;
import com.xhai.mall.model.UmsPermission;
import com.xhai.mall.model.UmsRole;
import com.xhai.mall.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户角色管理
 * @Author:dolphin
 */
@Controller
@Api(tags = "UmsRoleController",description = "后台用户角色管理")
@RequestMapping("/role")
public class UmsRoleController {
    @Autowired
    private UmsRoleService roleService;

    @ApiOperation("添加角色")
    @PostMapping(value = "/create")
    @ResponseBody
    public Object create(@RequestBody UmsRole role){
        int count = roleService.create(role);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改角色")
    @PostMapping(value = "/update/{id}")
    @ResponseBody
    public Object update(@PathVariable Long id, @RequestBody UmsRole role) {
        int count = roleService.update(id,role);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除角色")
    @PostMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = roleService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取相应角色权限")
    @GetMapping(value = "/permission/{roleId}")
    @ResponseBody
    public Object getPermissionList(@PathVariable Long roleId) {
        List<UmsPermission> permissionList =roleService.getPermissionList(roleId);
        return new CommonResult().success(permissionList);
    }

    @ApiOperation("修改角色权限")
    @PostMapping(value = "/permission/update")
    @ResponseBody
    public Object updatePermission(@RequestParam Long roleId,
                                   @RequestParam("permissionIds") List<Long> permissionIds) {
        int count = roleService.updatePermission(roleId,permissionIds);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取所有角色")
    @GetMapping(value = "/list")
    @ResponseBody
    public Object list(){
        List<UmsRole> roleList = roleService.list();
        return new CommonResult().success(roleList);
    }
}
