package com.example.demo.design.factoryMethod;

public class Test {
    public static void main(String[] args) {
        AddFactory addFactory = new AddFactory();
        AbstractTest operation = addFactory.createOperation();
        operation.setA(100);
        operation.setB(200);
        operation.getValue();
    }
}
