package com.shy.controller;

import com.shy.validator.UserDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hongyuan.shan
 * @Date: 2022/09/09/20:15
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class ValidateUserController {
    @PostMapping("/validateUser")
    public UserDTO userValidate(@RequestBody @Validated UserDTO userDTO){
        return userDTO;
    }
}
