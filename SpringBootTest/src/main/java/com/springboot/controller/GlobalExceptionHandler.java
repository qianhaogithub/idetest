package com.springboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qianhao
 * @create 2020/5/1-20:51
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> handleException(Exception ex) {
        Map<String,Object> map = new HashMap<>();
        map.put("code","100");
        map.put("msg",ex.getMessage());
        ex.printStackTrace();
        return map;
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Map<String,Object> handleArithmeticException(ArithmeticException ex) {
        Map<String,Object> map = new HashMap<>();
        map.put("code","100");
        map.put("msg",ex.getMessage());
        ex.printStackTrace();
        return map;
    }
}
