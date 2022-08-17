package com.shuaicai.record.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/16 22:49
 * @PackagePath com.shuaicai.record.controller
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world";
    }
}
