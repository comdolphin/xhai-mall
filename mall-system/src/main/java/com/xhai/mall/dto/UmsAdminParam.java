package com.xhai.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Email;


import javax.validation.constraints.NotNull;

/**
 * 用户登录参数
 * @Author:dolphin
 */
@Getter
@Setter
public class UmsAdminParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotNull(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotNull(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;
}
