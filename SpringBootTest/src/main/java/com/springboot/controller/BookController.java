package com.springboot.controller;

import com.springboot.bean.Book;
import com.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianhao
 * @create 2020/5/2-0:05
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/addbook/{name}")
    public Integer addBook(@PathVariable("name") String name) {
        int code = bookService.insert(name);
        return code;
    }

    @ResponseBody
    @RequestMapping("/getbook/{name}")
    public Book getBook(@PathVariable("name") String name){
        return bookService.select(name);
    }
}
