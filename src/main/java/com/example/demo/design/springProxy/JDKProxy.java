package com.example.demo.design.springProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 *
 */
public class JDKProxy implements InvocationHandler {

    Object target;

    //动态生成代理对象
    public Object getJDKProxy(Object targetObject){
        System.out.println("===============================");
        //System.out.println(targetObject);
        //为目标对象target赋值
        this.target = targetObject;
        //JDK动态代理只能针对实现了接口的类进行代理，newProxyInstance 函数所需参数就可看出
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    /**
     * 执行代理方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("|||||||||||||||||||||||||||||||");
        //System.out.println(proxy);

        Object result = method.invoke(target, args);
        System.out.println("|||||||||||||||||||||||||||||||");
        return result;
    }


}
