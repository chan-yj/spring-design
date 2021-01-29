package com.example.demo.design.factoryMethod;

/**
 * 加法工厂
 */
public class AddFactory implements IFactory{

    @Override
    public AbstractTest createOperation() {
        AddTest addTest = new AddTest();
        return addTest;
    }
}
