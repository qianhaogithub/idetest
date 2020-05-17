package com.springboot.dao;

import com.springboot.bean.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author qianhao
 * @create 2020/5/1-23:57
 */
@Mapper
public interface BookMapper {
    @Select("select * from Book where name=#{name}")
    public Book select(@Param("name") String name);

    @Insert("Insert into book(name) values(#{name})")
    public int insert(@Param("name")String name);
}
