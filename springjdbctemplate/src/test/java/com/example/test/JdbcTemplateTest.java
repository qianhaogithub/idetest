package com.example.test;

import com.example.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/5-10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class JdbcTemplateTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void testJdbcTemplate() {
        jdbcTemplate.execute("insert into user (name,age,address,describle) values ('bbb',18,'杭州','jobaaaa')");
    }

    @Test
    public void testSave() {
        String sql = "insert into user (name,age,address,describle) values (?,?,?,?)";
        jdbcTemplate.update(sql,"ddd",18,"浙江",null);
    }

    @Test
    public void testUpdate() {
        String sql = "update user set address=? where id=?";
        jdbcTemplate.update(sql,"广东",1);
    }

    @Test
    public void testDelete() {
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql,3);
    }

    @Test
    public void testQuery1() {
        String sql = "select * from user where id>?";
        List<User> users = jdbcTemplate.queryForList(sql, User.class, 1);
        System.out.println(users);
    }
}
