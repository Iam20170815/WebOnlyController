package com.ssp.feign.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "http://127.0.0.1:8082")
public interface ApiOfFeign {

    @GetMapping("/controllertest/test")
    String test();
}
