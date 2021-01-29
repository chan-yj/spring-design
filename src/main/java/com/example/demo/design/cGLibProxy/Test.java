package com.example.demo.design.cGLibProxy;

public class Test {
    public static void main(String[] args) {
        //实例化JDKProxy对象
        CGLibProxy cgLibProxy = new CGLibProxy();
        //被代理对象通过newProxyInstance动态获取代理对象
        //代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Actor actor = (Actor) cgLibProxy.getCGLibProxy(new Actor());
        //执行新增方法
        actor.basicAct(200f);
    }
}
