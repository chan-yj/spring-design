package com.example.demo.design.cGLibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * CGLib代理类
 *
 */
public class CGLibProxy implements MethodInterceptor {

    Object target;

    //动态生成代理对象
    public Object getCGLibProxy(Object targetObject){
        System.out.println("===============================");
        //System.out.println(targetObject);
        //为目标对象target赋值
        this.target = targetObject;
        //JDK动态代理只能针对实现了接口的类进行代理，newProxyInstance 函数所需参数就可看出
        return Enhancer.create(targetObject.getClass(), targetObject.getClass().getInterfaces(), this);
    }

    /**
     * 执行被代理对象的任何方法，都会经过该方法。
     * 在此方法内部就可以对被代理对象的任何方法进行增强
     *
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("|||||||||||||||||||||||||||||||");
        //System.out.println(proxy);
        Object result = method.invoke(target, objects);
        System.out.println("|||||||||||||||||||||||||||||||");
        return result;
    }
}
