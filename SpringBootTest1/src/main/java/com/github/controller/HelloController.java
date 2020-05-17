package com.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianhao
 * @create 2020/5/2-14:00
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object helloWorld() {
        return "Hello World SpringBoot  11!";
    }
}
