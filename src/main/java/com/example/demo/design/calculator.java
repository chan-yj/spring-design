package com.example.demo.design;

/**
 * 输入两数与运算符号，得到结果
 * 没有应用到设计模式情况
 */
public class calculator {

    public static Integer getResult(Integer a, Integer b, String symbol){
        Integer c = null;
        if(symbol.equals("*")){
            c =  a * b;
        }else if(symbol.equals("+")){
            c =  a * b;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println("登录状态的关系...");
    }

}
