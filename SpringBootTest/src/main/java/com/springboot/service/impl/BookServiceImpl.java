package com.springboot.service.impl;

import com.springboot.bean.Book;
import com.springboot.dao.BookMapper;
import com.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qianhao
 * @create 2020/5/2-0:02
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book select(String name) {
        return bookMapper.select(name);
    }

    @Override
    public int insert(String name) {
        return bookMapper.insert(name);
    }
}
