package com.ssp.feign.controller;

import com.ssp.feign.api.ApiOfFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FeignController {

    @Autowired
    private ApiOfFeign apiOfFeign;


    @GetMapping(value = "/consumer/getstr")
    public String getRandomInt() {

        log.info("#1 ¿ªÊ¼Ö´ÐÐ");
        return apiOfFeign.test();

    }

}
