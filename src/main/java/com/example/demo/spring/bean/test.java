package com.example.demo.spring.bean;

import com.example.demo.spring.bean.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        //使用ApplicationContext接口，就是在初始化spring容器，解析bean.xml，创建对象
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean/bean.xml");

        //根据bean的id获取对象
        IAccountService aService= (IAccountService) ac.getBean("accountService");
        System.out.println(aService);

        //执行方法
        aService.saveAccount();

    }


}
