package com.example.demo.design.factoryMethod;

public class SubFactory implements IFactory{

    @Override
    public AbstractTest createOperation() {
        SubTest addTest = new SubTest();
        return addTest;
    }
}
