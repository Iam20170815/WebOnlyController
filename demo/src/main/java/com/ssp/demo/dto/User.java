package com.ssp.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * �๦������
 *
 * @Author wudongli
 * @Date 2020/1/2 22:07
 */
@Data
public class User {

    @NotNull(message = "ID����ΪNULL")
    private String id;

    @NotBlank(message = "��������Ϊ��")
    private String name;

    @NotBlank(message = "���䲻��Ϊ��")
    private String age;
}
