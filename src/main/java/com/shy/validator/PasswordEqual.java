package com.shy.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author hongyuan.shan
 * @date 2022/09/11 21:12
 * @description
 */
@Documented
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordEqualValidator.class)
public @interface PasswordEqual {

    // 校验未通过时的返回信息
    String message() default "passwords are not equal";

    // 以下两行为固定模板
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
