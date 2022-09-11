package com.shy.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hongyuan.shan
 * @date 2022/09/11 20:43
 * @description 自定义密码校验器
 */
public class PasswordEqualValidator implements ConstraintValidator<PasswordEqual, MyUserDTO> {

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(MyUserDTO myUserDTO, ConstraintValidatorContext context) {
        String password1 = myUserDTO.getPassword1();
        String password2 = myUserDTO.getPassword2();
        // 这里只是做示例用，所以简单实用了equals进行对比，实际使用可以根据业务要求做更多拓展
        boolean match = password1.equals(password2);
        return match;
    }
}

