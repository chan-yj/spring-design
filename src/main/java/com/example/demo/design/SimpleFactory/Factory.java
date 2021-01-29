package com.example.demo.design.SimpleFactory;

/**
 * 简单工厂生产实例
 * 根据不同条件生产不同的实例
 *
 */
public class Factory {

    public static AbstractTest createObj(String type){
        AbstractTest abstractTest;
        switch(type){
            case "+":
                System.out.println("+++++++++++++++++++++++++++++");
                abstractTest = new AddTest();
                break;
            case "-":
                System.out.println("-----------------------------");
                abstractTest = new SubTest();
                break;
            default:
                System.out.println("++++++++++++++++++++++++++++++");
                abstractTest = new AddTest();
                break;
        }

        return abstractTest;

    }
}
