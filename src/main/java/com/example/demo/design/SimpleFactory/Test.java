package com.example.demo.design.SimpleFactory;

public class Test {


    public static void main(String[] args) {

        AbstractTest obj = Factory.createObj("-");
        obj.setA(100);
        obj.setB(200);
        obj.getValue();

    }


}
