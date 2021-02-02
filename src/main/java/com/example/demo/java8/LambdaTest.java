package com.example.demo.java8;

import java.util.*;

/**
 * 简化匿名内部类
 * 简化函数式接口
 *
 * @author ly-caohr
 */
public class LambdaTest {

    public static void main(String[] args) {

        //正常的
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("业务处理");
           }
       }).start();


       //lambda表达式：去掉接口名与方法名
       new Thread(()->{
           System.out.println("业务处理");
       }).start();


       //测试带参函数的简写
       String[] arr = {"aI", "blove", "dyo", "ctoo"};
       List<String> list = Arrays.asList(arr);

       Collections.sort(list, new Comparator<String>(){// 接口名
           @Override
           public int compare(String s1, String s2){// 方法名
               if(s1 == null)
                   return -1;
               if(s2 == null)
                   return 1;
               //字符串长度比较，正序
               //return s1.length()-s2.length();

               //首字母比较，正序
               return s1.compareTo(s2);
           }
       });


        //正序
        System.out.println(list);


        //lambda表达式
        Collections.sort(list, (s1,s2) ->{
            if(s1 == null)
                return -1;
            if(s2 == null)
                return 1;
            //字符串长度比较，正序
            //return s1.length()-s2.length();

            //首字母比较，正序
            return s1.compareTo(s2);
        });


        // 使用forEach()结合Lambda表达式迭代
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list2.forEach( str -> {
            if(str.length()>3)
                System.out.println(str);
        });


        //正常的
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        //Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }




    }


}
