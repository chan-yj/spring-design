package com.example.demo.design.abstractFactory;

public class SqlUser implements IUser{

    @Override
    public void insert(User user) {
        System.out.println("mysql createUser");
    }

    @Override
    public User getUser() {
        System.out.println("mysql getUser");
        User user = new User();
        user.setName("mysql");
        return user;
    }
}
