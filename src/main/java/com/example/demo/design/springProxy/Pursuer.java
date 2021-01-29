package com.example.demo.design.springProxy;


/**
 * 追求者，被代理对象
 *
 */
public class Pursuer implements Gift {


    @Override
    public void food() {
        System.out.println("send gift to girl ,the girl is name");
    }
}
