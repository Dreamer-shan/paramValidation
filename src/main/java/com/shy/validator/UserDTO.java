package com.shy.validator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hongyuan.shan
 * @Date: 2022/09/09/19:50
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotBlank(message = "手机号不能为空")
    private String mobile;

    @NotNull(message = "性别不能为空")
    private Integer sex;

    @NotNull(message = "年龄不能为空")
    private Integer age;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

}
