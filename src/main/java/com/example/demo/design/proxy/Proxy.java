package com.example.demo.design.proxy;

/**
 * 此是静态代理类，与jdk动态代理不同
 * 追求者通过代理访问资源（资源既是追求女孩）
 * 此可以实现InvocationHandler来实现动态代理Pursuer
 */
public class Proxy implements Gift{

    Pursuer pursuer;

    public Proxy(Girl girl) {
        this.pursuer = new Pursuer(girl);
    }

    @Override
    public void food() {
        //可以做前置增强
        pursuer.food();
        //可以做后置增强
    }


}
