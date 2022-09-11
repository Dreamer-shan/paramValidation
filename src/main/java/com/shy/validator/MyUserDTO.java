package com.shy.validator;

import lombok.Data;

/**
 * @author hongyuan.shan
 * @date 2022/09/11 21:11
 * @description
 */
@Data
@PasswordEqual(message = "两次密码不能相同")
public class MyUserDTO {
    private String password1;
    private String password2;
}
