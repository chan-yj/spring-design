package com.example.demo.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForeachTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(8);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s);
            }
        });

        System.out.println("///////////////////");

        list.forEach(a ->{
            System.out.println(a);
        });


    }
}
