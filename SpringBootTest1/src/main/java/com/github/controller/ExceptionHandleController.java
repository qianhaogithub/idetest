package com.github.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qianhao
 * @create 2020/5/2-19:23
 */
@ControllerAdvice
public class ExceptionHandleController {

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception exception){
        exception.printStackTrace();
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception",exception);
        mv.addObject("url",request.getRequestURL());
        mv.setViewName("error");
        return mv;
    }

    @ExceptionHandler(value = RuntimeException.class)
    public Object errorHandler1(HttpServletRequest request, HttpServletResponse response,RuntimeException exception){
        exception.printStackTrace();
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception",exception);
        mv.addObject("url",request.getRequestURL());
        mv.setViewName("error");
        return mv;
    }
}
