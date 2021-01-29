package com.example.demo.design.decorator;

/**
 * 额外添加的功能A
 *
 */
public class DecoratorB extends Decorator{


    @Override
    public void show(){
        System.out.println("DecoratorB==============DecoratorB");
        super.show();
    }

}
