package com.example.demo.design.springProxy;

public class Test {
    public static void main(String[] args) {
        //实例化JDKProxy对象
        JDKProxy jdkProxy = new JDKProxy();
        //被代理对象通过newProxyInstance动态获取代理对象
        //代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Gift user = (Gift) jdkProxy.getJDKProxy(new Pursuer());
        //执行新增方法
        user.food();
    }
}
