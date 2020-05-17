package com.springboot.controller;

import com.springboot.bean.Person;
import com.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianhao
 * @create 2020/5/1-21:50
 */
@Controller
public class YmlTestController {
    @Autowired
    private User user;

    @Autowired
    private Person person;

    @Value("${address}")
    private String address;
    @Value("${user.lastname}")
    private String lasename;

    @RequestMapping("ymltest3")
    @ResponseBody
    public Person ymlTest3(){
        return person;
    }

    @RequestMapping("ymltest2")
    @ResponseBody
    public String ymlTest2(){
        return address + "===" + lasename;
    }


    @RequestMapping("ymltest")
    @ResponseBody
    public User ymlTest(){
        return user;
    }
}
