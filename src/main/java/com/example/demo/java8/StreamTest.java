package com.example.demo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 集合和数组是我们经常会用到的数据结构，
 * 需要经常对他们做增、删、改、查、聚合、统计、过滤等操作。
 * 集合set,列表list,哈希map进行stream流操作
 *
 * @author ly-caohr
 */
public class StreamTest {

    public static void main(String[] args) {
//        //List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
//        //Stream<String> stream = strings.stream();
//
//        //filter去掉空字符串
//        List<String> strings = Arrays.asList("Hollis", "", "HollisChuang", "H", "hollis");
//        //strings.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);
//
//        strings.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//               if(!s.isEmpty()){
//                   System.out.println(s);
//               }
//               return true;
//            }
//        });


//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//        //lambda表达式
//        numbers.stream().sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        }).forEach(System.out::println);
//
//        //lambda表达式
//        numbers.stream().sorted(
//            (Integer o1, Integer o2) ->{
//                return o2-o1;
//            }
//        ).forEach(System.out::println);


//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        numbers.stream().distinct().forEach(a->{
//            System.out.println(a);
//        });
//        System.out.println(numbers);

//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        //stream经过中间操作，得到结果，转成列表list
//        //Stream的最终操作可以将Stream转成其他形式，如计算出流中元素的个数、分组、将流转换成集合、以及元素的遍历等。
//        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);


        //Arrays.asList不是java.util.List类型，而是类型似list，可以转成java.util.List
        //体现了多态，但是调用add的方法的话，因为java.util.List是接口，它就会找子类，而
        //Arrays.asList方法中没有add方法，所以会报错
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.add(10);
        numbers.add(12);
        System.out.println(numbers);


//        try (BufferedReader br = new BufferedReader(new FileReader("d:\\ hollischuang.xml"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            // handle exception
//        }





    }



}
