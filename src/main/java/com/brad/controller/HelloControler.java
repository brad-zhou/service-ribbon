package com.brad.controller;

import com.brad.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubd
 * @Date 2018/11/13 9:40
 * @@Description
 */
@Slf4j
@RestController("/")
public class HelloControler {
    @Autowired
    private HelloService helloService;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
