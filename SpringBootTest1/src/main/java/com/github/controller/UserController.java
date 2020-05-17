package com.github.controller;

import com.github.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qianhao
 * @create 2020/5/2-14:45
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/getUser/{username}")
    public User getUser(@PathVariable(value="username") String username) throws ParseException {
        User user = new User();
        user.setSerialno(3L);
        user.setAge(25);
        user.setBitthday(new SimpleDateFormat("yyyy-MM-dd").parse("1995-07-11"));
        user.setGender("111");
        user.setUsername(username);
        user.setPassword("aaaaa");
        return user;
    }
}
