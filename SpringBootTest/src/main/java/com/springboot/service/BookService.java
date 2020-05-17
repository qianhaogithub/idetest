package com.springboot.service;

import com.springboot.bean.Book;
import org.apache.ibatis.annotations.Param;

/**
 * @author qianhao
 * @create 2020/5/2-0:01
 */
public interface BookService {

    Book select(@Param("name") String name);
    int insert(@Param("name")String name);
}
