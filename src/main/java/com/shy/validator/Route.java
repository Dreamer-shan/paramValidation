package com.shy.validator;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hongyuan.shan
 * @Date: 2022/09/09/20:43
 * @Description:
 */
@Data
public class Route {
    @NotNull(groups = {ValidateGroup.RouteValidStart.class}, message = "始发地省id不能为空")
    private Integer startProvinceId;

    @NotNull(groups = {ValidateGroup.RouteValidEnd.class}, message = "目的地省id不能为空")
    private Integer endProvinceId;

    @NotBlank(groups = {ValidateGroup.RouteValidStart.class, ValidateGroup.RouteValidEnd.class}, message = "详细地址不能为空")
    private String address;
}