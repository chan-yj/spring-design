package com.example.demo.design.cGLibProxy;

/**
 * 被代理对象
 */
public class Actor {

    public void basicAct(float money){
        System.out.println("get money, show show show："+money);
    }
    public void dangerAct(float money){
        System.out.println("拿到钱，开始危险的表演："+money);
    }
}
