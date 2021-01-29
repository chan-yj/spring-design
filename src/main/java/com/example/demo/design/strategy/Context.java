package com.example.demo.design.strategy;

/**
 * 维护strategy类的引用
 * 管理策略方法
 *
 */
public class Context {
    public Strategy strategy;

    /**
     * 这个可以结合简单工厂来生成抽象策略类
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmMethod();
    }

}
