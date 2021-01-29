package com.example.demo.design.test;

public class Xiaoming extends Person{

    @Override
    public void eat() {
        System.out.println("xiaoming eat baba.....");
    }

    /**
     * 内存模型图要看一下
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Xiaoming();
        person.eat();
    }
}
