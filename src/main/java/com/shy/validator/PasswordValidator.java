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
public class PasswordValidator implements ConstraintValidator<Password, CharSequence> {
    private Pattern pattern;
    @Override
    public void initialize(Password constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        final String regexp = constraintAnnotation.regexp();
        this.pattern = Pattern.compile(regexp);
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        if (value == null || value.length() == 0){
            return false;
        }
        final Matcher matcher = this.pattern.matcher(value);
        return matcher.matches();
    }
}
