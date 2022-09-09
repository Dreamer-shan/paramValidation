package com.shy.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

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
        map.put("code", 400);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        System.out.println(map);
        return map;
    }
}
