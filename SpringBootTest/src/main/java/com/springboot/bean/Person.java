package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author qianhao
 * @create 2020/5/1-21:42
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastname;
    private int age;
    private boolean boss;
    private Date birth;
    private Map<String, String> map;
    private List<String> lists;
    private Dog dog;

    public String getLastname() {
        return lastname;
    }

    public Person setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public boolean isBoss() {
        return boss;
    }

    public Person setBoss(boolean boss) {
        this.boss = boss;
        return this;
    }

    public Date getBirth() {
        return birth;
    }

    public Person setBirth(Date birth) {
        this.birth = birth;
        return this;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Person setMap(Map<String, String> map) {
        this.map = map;
        return this;
    }

    public List<String> getLists() {
        return lists;
    }

    public Person setLists(List<String> lists) {
        this.lists = lists;
        return this;
    }

    public Dog getDog() {
        return dog;
    }

    public Person setDog(Dog dog) {
        this.dog = dog;
        return this;
    }
}
