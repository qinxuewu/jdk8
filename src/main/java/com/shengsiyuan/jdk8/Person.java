package com.shengsiyuan.jdk8;

/**
 * @author wangmeng
 * @date 2019/4/16
 * @desciption
 */
public class Person {

    private String username;
    private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
