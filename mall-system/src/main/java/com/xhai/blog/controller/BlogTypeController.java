package com.xhai.blog.controller;


import com.github.pagehelper.PageInfo;
import com.xhai.blog.dto.Type;
import com.xhai.blog.service.BizTypeService;
import com.xhai.mall.blog.business.annotation.BussinessLog;
import com.xhai.mall.blog.business.enums.ResponseStatus;
import com.xhai.mall.blog.business.vo.TypeConditionVO;
import com.xhai.mall.blog.framework.object.ResponseVO;
import com.xhai.mall.blog.util.ResultUtil;
import com.xhai.mall.dto.CommonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: dolphin
 */
@Controller
@RequestMapping("/type")
public class BlogTypeController {

    @Autowired
    private BizTypeService typeService;

    @ApiOperation("添加分类")
    @PostMapping(value = "/add")
    @BussinessLog("添加分类")
    public ResponseVO add(Type type) {
        typeService.insert(type);
        return ResultUtil.success("文章类型添加成功！新类型 - " + type.getName());
    }

    @ApiOperation("查询分类")
    @GetMapping(value = "/list")
    @BussinessLog("添加分类")
    @ResponseBody
    public Object list(TypeConditionVO vo) {
        PageInfo<Type> pageInfo = typeService.findPageBreakByCondition(vo);
        /*return ResultUtil.tablePage(pageInfo);*/
        return new CommonResult().pageSuccess(pageInfo.getList());
    }

    @PostMapping(value = "/remove")
    @BussinessLog("删除分类")
    public ResponseVO remove(Long[] ids) {
        if (null == ids) {
            return ResultUtil.error(500, "请至少选择一条记录");
        }
        for (Long id : ids) {
            typeService.removeByPrimaryKey(id);
        }
        return ResultUtil.success("成功删除 [" + ids.length + "] 个文章类型");
    }

    @PostMapping("/get/{id}")
    @BussinessLog("获取分类详情")
    public ResponseVO get(@PathVariable Long id) {
        return ResultUtil.success(null, this.typeService.getByPrimaryKey(id));
    }

    @PostMapping("/edit")
    @BussinessLog("编辑分类")
    public ResponseVO edit(Type type) {
        try {
            typeService.updateSelective(type);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error("文章类型修改失败！");
        }
        return ResultUtil.success(ResponseStatus.SUCCESS);
    }

    @PostMapping("/listAll")
    public ResponseVO listType() {
        return ResultUtil.success(null, typeService.listTypeForMenu());
    }

    @PostMapping("/listParent")
    public ResponseVO listParent() {
        return ResultUtil.success(null, typeService.listParent());
    }
}
