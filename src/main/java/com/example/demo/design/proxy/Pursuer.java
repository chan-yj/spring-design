package com.example.demo.design.proxy;

/**
 * 追求者，被代理对象，目标对象
 *
 */
public class Pursuer implements Gift{

    private Girl girl;

    public Pursuer(Girl girl){
        this.girl = girl;
    }


    @Override
    public void food() {
        System.out.println("send gift to girl ,the girl is name==="+girl.getName());
    }
}
