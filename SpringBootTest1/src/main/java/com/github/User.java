package com.github;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @author qianhao
 * @create 2020/5/2-14:43
 */
public class User {
    private Long serialno;
    private String username;
    private int age;
    @JsonFormat(pattern = "yyyy-MM-DD HH:mm:ss a",locale="zh",timezone = "GMT+8")
    private Date bitthday;
    private String gender;
    @JsonIgnore
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;

    public User() {
    }

    public User(Long serialno, String username, int age, Date bitthday, String gender) {
        this.serialno = serialno;
        this.username = username;
        this.age = age;
        this.bitthday = bitthday;
        this.gender = gender;
    }

    public Long getSerialno() {
        return serialno;
    }

    public User setSerialno(Long serialno) {
        this.serialno = serialno;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public Date getBitthday() {
        return bitthday;
    }

    public User setBitthday(Date bitthday) {
        this.bitthday = bitthday;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public User setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
