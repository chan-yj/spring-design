package com.example.demo.design.decorator;

/**
 * 人穿衣服，装饰者模式
 * 在已有功能基础上，动态地为类额外的增加更多功能
 * 有效地把类的核心功能与装饰功能区别开，
 * 比如核心功能Person:核心功能,装饰类Decorator:装饰功能
 *
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("person show============="+name);

    }

}
