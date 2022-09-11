package com.shy.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hongyuan.shan
 * @Date: 2022/09/09/20:28
 * @Description:
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    // 捕获 MethodArgumentNotValidException 异常
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public HashMap<String, Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        log.error("参数非法");
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", HttpStatus.BAD_REQUEST);
//        map.put("msg", e.getMessage());
        map.put("msg", Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
        map.put("url", request.getRequestURL());
        System.out.println(map);
        return map;
    }

    //    ConstraintViolationException
    @ExceptionHandler(value = ConstraintViolationException.class)
    public HashMap<String, Object> handleMethodConstraintViolationException(ConstraintViolationException e, HttpServletRequest request) {
        log.error("参数非法");
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", HttpStatus.BAD_REQUEST);
//        map.put("msg", e.getMessage());
        map.put("msg", Objects.requireNonNull(e.getConstraintViolations()));
        map.put("url", request.getRequestURL());
        System.out.println(map);
        return map;
    }
}
