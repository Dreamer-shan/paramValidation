package com.shy.vo;

import lombok.*;

/**
 * @author hongyuan.shan
 * @date 2022/09/09 23:49
 * @description
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultCode {
    USERNAME_PASSWORD_ERROR(5001,"用户名密码错误"),
    SUCCESS(1000, "操作成功"),
    FAILED(1001, "响应失败"),
    VALIDATE_FAILED(1002, "参数校验失败"),
    ERROR(5000, "未知错误");

    private Integer code;
    private String message;

}
