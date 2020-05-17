package com.github.controller;

import com.github.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author qianhao
 * @create 2020/5/2-17:45
 */
@Controller
@RequestMapping("/th")
public class ThymeleafTestController {

    @RequestMapping("/test1")
    public String testThymeLeaf(ModelMap modelMap) throws ParseException {
        modelMap.put("name","zhangsan");
        User user = new User();
        user.setSerialno(3L);
        user.setAge(25);
        user.setBitthday(new SimpleDateFormat("yyyy-MM-dd").parse("1995-07-11"));
        user.setGender("111");
        user.setUsername("username");
        user.setPassword("aaaaa");
        user.setDesc("<span style='color:red;'>hello World</span>");
        modelMap.addAttribute(user);
        return "html/index";
    }

    @RequestMapping("/test2")
    public String testThymeLeaf2(User u){
        return "html/index1";
    }

    @RequestMapping("/form")
    public String insertUser(){
        return "redirect:html/index";
    }

    @RequestMapping("/error")
    public String toError(){
        int a = 1/0;
        return "redirect:html/index";
    }
}
