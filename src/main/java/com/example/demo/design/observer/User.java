package com.example.demo.design.observer;

/**
 * 观察者
 * 实现了update方法
 *
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(name + " received: " + message);
    }


}