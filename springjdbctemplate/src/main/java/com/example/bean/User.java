package com.example.bean;

/**
 * @author qianhao
 * @create 2020/5/5-10:46
 */
public class User {
    private Integer id;
    private String name;
    private int age;
    private String address;
    private String describle;

    public User() {
    }

    public User(Integer id, String name, int age, String address, String describle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.describle = describle;
    }

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDescrible() {
        return describle;
    }

    public User setDescrible(String describle) {
        this.describle = describle;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", describle='" + describle + '\'' +
                '}';
    }
}
