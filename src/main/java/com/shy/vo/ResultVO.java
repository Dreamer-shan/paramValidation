package com.shy.vo;

import lombok.Data;

/**
 * @author hongyuan.shan
 * @date 2022/09/09 23:51
 * @description
 */
@Data
public class ResultVO<T> {
    private static final ResultCode SUCCESS = ResultCode.SUCCESS;
    private static final ResultCode FAIL = ResultCode.FAILED;

    private Integer code;

    private String message;

    private T  data;

    public static <T> ResultVO<T> ok() {

        return result(SUCCESS,null);
    }

    public static <T> ResultVO<T> ok(T data) {
        return result(SUCCESS,data);
    }

    public static <T> ResultVO<T> ok(ResultCode resultCode) {
        return result(resultCode,null);
    }

    public static <T> ResultVO<T> ok(ResultCode resultCode, T data) {
        return result(resultCode,data);
    }

    public static <T> ResultVO<T> fail() {
        return result(FAIL,null);
    }

    public static <T> ResultVO<T> fail(ResultCode resultCode) {
        return result(FAIL,null);
    }


    public static <T> ResultVO<T> fail(T data) {
        return result(FAIL,data);
    }

    public static <T> ResultVO<T> fail(ResultCode resultCode, T data) {
        return result(resultCode,data);
    }

    private static <T>  ResultVO<T> result(ResultCode resultCode, T data) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(resultCode.getCode());
        resultVO.setMessage(resultCode.getMessage());
        resultVO.setData(data);
        return resultVO;
    }
}

