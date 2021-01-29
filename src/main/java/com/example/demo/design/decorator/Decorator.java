package com.example.demo.design.decorator;

/**
 * 服务展示
 *
 */
public class Decorator extends Person{

    public Person person;

    public  void showDecorator(Person decorator){
        this.person = decorator;
    }

    /**
     * 增加的功能
     */
    public void show(){
        person.show();
    }



}
