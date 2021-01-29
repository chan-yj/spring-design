package com.example.demo.design.factoryMethod;

public class SubTest extends AbstractTest {

    @Override
    public void getValue(){
        double a = getA();
        double b = getB();

        System.out.println("my is sub::::"+(a-b));
    }

}
