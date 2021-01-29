package com.example.demo.juc;

public class SingleTonTest {

    private SingleTonTest(){}
    private static SingleTonTest Instance ;

     static{
         Instance = new SingleTonTest();
    }

    public static SingleTonTest getInstance(){
        return Instance;
    }



}
