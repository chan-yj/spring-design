package com.example.demo.design.decorator;


public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("xiaoming");

        ///DecoratorB decoratorB = new DecoratorB();
        DecoratorA decoratorA = new DecoratorA();

        //A包装person
        decoratorA.showDecorator(person);
        //B包装A
        //decoratorB.showDecorator(decoratorA);
        //B显示
        decoratorA.show();

    }



}