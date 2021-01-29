package com.example.demo.design.decorator;

/**
 * 额外添加的功能A
 *
 */
public class DecoratorA extends Decorator{



    @Override
    public void show(){
        System.out.println("DecoratorA============DecoratorA");
        super.show();
    }

}
