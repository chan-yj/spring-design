package com.example.demo.design.strategy;

/**
 * 策略类
 * 封装不同的算法，不同的算法不同的实现，但是不同的算法有相同的结果，也就是公共功能
 * 策略类strategy封装了抽象的策略公共方法，context实现具体算法选择与结果获取
 */
public abstract class Strategy {

    /**
     * 算法方法
     *
     */
    public abstract void algorithmMethod();

}
