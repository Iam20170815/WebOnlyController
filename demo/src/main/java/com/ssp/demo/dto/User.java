package com.ssp.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 类功能描述
 *
 * @Author wudongli
 * @Date 2020/1/2 22:07
 */
@Data
public class User {

    @NotNull(message = "ID不能为NULL")
    private String id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "年龄不能为空")
    private String age;
}
