package com.ssp.demo.service;

import com.ssp.demo.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * ¿‡π¶ƒ‹√Ë ˆ
 *
 * @Author wudongli
 * @Date 2020/1/2 22:20
 */
@Service
@Slf4j
public class CheckInParmService {

    public String addUser(@Valid User user) {

        log.info("Begin addUser");
        log.info("End User");
        return "add success!";
    }
}
