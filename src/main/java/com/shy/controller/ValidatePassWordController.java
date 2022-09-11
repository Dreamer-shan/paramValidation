package com.shy.controller;

import com.shy.api.CommonResult;
import com.shy.validator.MyUserDTO;
import com.shy.validator.Password;
import com.shy.validator.PasswordEqual;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;

/**
 * @author hongyuan.shan
 * @date 2022/09/11 20:47
 * @description
 */
@RestController
@RequestMapping("/password")
@Validated  // 写在类上，否则失效
public class ValidatePassWordController {
    @ResponseBody
    @RequestMapping(value = "/modifyPassword", method = RequestMethod.GET)
    public CommonResult modifyPassword(@Password String password){
        System.out.println(password);
        return CommonResult.success(password);
    }

    @ResponseBody
    @RequestMapping(value = "/equalPassword", method = RequestMethod.GET)
    public CommonResult modifyPassword(@PasswordEqual MyUserDTO myUserDTO){
        System.out.println(myUserDTO);
        return CommonResult.success(myUserDTO);
    }
}
