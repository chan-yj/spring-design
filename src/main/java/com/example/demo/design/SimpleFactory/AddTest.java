package com.example.demo.design.SimpleFactory;

public class AddTest extends AbstractTest{

    @Override
    public void getValue(){
        double a = getA();
        double b = getB();

        System.out.println("my is add::::"+(a+b));
    }
}

