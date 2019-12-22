package com.ssp.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controllertest")
@Api(tags = "公共函数测试controller")
public class TestController {

    /**
     * helloworld测试
     *
     * @return
     */
    @RequestMapping("/test")
    public String test() {

        return "Test Spring Boot!";
    }
}
