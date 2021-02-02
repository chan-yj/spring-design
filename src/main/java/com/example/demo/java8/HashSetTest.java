package com.example.demo.java8;

import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

    public static void main(String[] args) {
        // public TreeSet(Comparator<? super E> comparator) {
        //        this(new TreeMap<>(comparator));
        //    }
        Set<Person> set = new TreeSet<>();
        set.add(new Person(1, "张三", 1));
        set.add(new Person(34, "王五", 3));
        set.add(new Person(232, "李四", 2));
        for (Person person : set) {
            System.out.println(person.getId());
        }


    }
}
