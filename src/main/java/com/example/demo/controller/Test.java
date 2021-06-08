package com.example.demo.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test {

    //private static  int i = 0;

    @RequestMapping("/test1")
    public String test1(){
        Integer i = 0;
        i = i++;
        return i+"";
    }

    @RequestMapping("/test2")
    @Transactional
    public Integer test2(){

        //Integer a;
        int i = 0;
        //System.out.println(i);
        //System.out.println("=======================");
        //先复制运算，再++

        //0入栈，常量入栈，bipush
        //出栈0,赋值给变量i，istore，局部变量入栈
        //变量i入栈，iload_2
        //变量i作++操作，iinc指令不修改操作栈
        i = i + 1;
        //System.out.println(i);
        System.out.println("=======================");
        i = i - 100;
        System.out.println(i);
        return i;
        //++1

    }

    public static void main(String[] args){
        //       3: bipush        66
        //       5: istore_2
        //       6: iload_2
        //       7: iinc          2, 1
        //      10: istore_2

//        int a=10;
//        int varNum=66;
//        varNum=varNum++;
//        System.out.println(varNum);



        //       0: bipush        66
        //       2: istore_1
        //       3: iinc          1, 1
        //       6: iload_1
        //       7: istore_1

        //      11: iload_1
        //      15: return
//        int varNum = 66;
//        varNum = ++ varNum;
//        System.out.println(varNum);



        //       0: bipush        66
        //       2: istore_1
        //       3: iload_1
        //       4: iconst_1
        //       5: iadd
        //       6: istore_1

        //      10: iload_1
        //      14: return
        int varNum = 66;
        varNum = varNum + 1;
        System.out.println(varNum);

        //itar

        String a = "ksdkfksd,sdkfksdf,sdfds";
        a.split(",");


    }

    //ctrl+o
    //查看我们继承的类或者接口中的方法，以及我们要实现的方法
    class test2 implements Runnable{

        @Override
        public void run() {

        }
    }



}
