package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianhao
 * @create 2020/5/1-19:38
 */
@SpringBootApplication
@RestController
public class SpringTestController {

    @RequestMapping("/hello")
    public String hello() throws Exception{
        //int a = 1/0;
        String aaa = null;
        System.out.println(aaa.substring(1));
        return "Hello Spring Boot!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringTestController.class);
    }
}
