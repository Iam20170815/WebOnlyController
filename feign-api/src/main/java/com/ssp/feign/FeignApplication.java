package com.ssp.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//DataSourceAutoConfiguration会自动加载,如果不想加载数据库就先将其exclude
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {

		SpringApplication.run(FeignApplication.class, args);

	}

}
