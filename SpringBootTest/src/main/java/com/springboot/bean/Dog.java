package com.springboot.bean;

/**
 * @author qianhao
 * @create 2020/5/1-21:45
 */
public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Dog setAge(int age) {
        this.age = age;
        return this;
    }
}
