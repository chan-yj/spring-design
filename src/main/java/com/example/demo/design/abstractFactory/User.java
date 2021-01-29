package com.example.demo.design.abstractFactory;


/**
 * 观察者
 * 实现了update方法
 *
 */
public class User {

    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}