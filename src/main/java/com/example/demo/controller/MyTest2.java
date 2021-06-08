package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class MyTest2 {

    public static void main(String[] args) throws Exception{
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //创建自定义的类加载器并重写loadClass方法
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        //使用自定义类加载器加载对象
        Object obj = myLoader.loadClass("com.example.demo.controller.MyTest2").newInstance();

        System.out.println(obj.getClass());
        System.out.println(obj instanceof com.example.demo.controller.MyTest2);

        System.out.println(obj.getClass().getClassLoader());
        System.out.println(MyTest2.class.getClassLoader());


    }

}
