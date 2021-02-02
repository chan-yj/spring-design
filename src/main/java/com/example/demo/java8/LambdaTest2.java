package com.example.demo.java8;


/**
 * 测试lambda函数
 */
public class LambdaTest2 {

    //在测试类中定义public static void getProduct(int a , int b ,Operation tool),
    //该方法的预期行为打印使用tool的cal(a,b)的计算结果
    //类型使用接口类型
    public static void getProduct(int a , int b ,Operation tool){
        int result = tool.operation(a, b);
        System.out.println("结果：" + result);
    }


    public static void main(String[] args) {
        getProduct(10,20, (a,b)->{
            int d = 100;
            int c = a+b;
            int f = d+c;
            return f;
        });

    }

}

//定义一个函数式接口Operation,其中抽象方法int operation(int a , int b)，使用注解@FunctionalInterfac
@FunctionalInterface
interface Operation {
    int operation(int a,int b);
}

