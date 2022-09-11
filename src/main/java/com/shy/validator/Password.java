package com.shy.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Email;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author hongyuan.shan
 * @date 2022/09/11 20:39
 * @description
 */
@Documented
@Constraint(validatedBy = {PasswordValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(Password.List.class)
public @interface Password {
    String message() default "密码必须包含大小写字母、数字、特殊符号，且长度为8~16！";

    String regexp() default "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*]).{8,16}$";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        Password[] value();
    }
}
