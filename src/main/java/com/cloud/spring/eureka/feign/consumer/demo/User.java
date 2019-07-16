package com.cloud.spring.eureka.feign.consumer.demo;

public class User {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name = " + name + ", age = " + age;
    }
}
