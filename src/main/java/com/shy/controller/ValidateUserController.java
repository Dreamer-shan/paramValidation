package com.shy.controller;

import com.shy.api.CommonResult;
import com.shy.validator.Route;
import com.shy.validator.UserDTO;
import com.shy.validator.ValidateGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public CommonResult userValidate(@RequestBody @Validated UserDTO userDTO){
        return CommonResult.success(userDTO);

    }

    @PostMapping("/addRoute")
    public CommonResult addRoute(@RequestBody @Validated({ValidateGroup.RouteValidStart.class}) Route route){
        return CommonResult.success(route);
    }

//    public CommonResult addRoute1(@RequestBody @Validated(ValidateGroup.RouteValidStart.class) Route route){
//
//    }
}
