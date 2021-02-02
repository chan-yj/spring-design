package com.example.demo.java8;

/**
 * 注意：没有重写equals方法和hashCode的Person
 * Comparable与Comparator的区别：
 * 实现Comparable：该类支持排序
 * 实现Comparable：建立一个“该类的比较器”来进行排序
 *
 * @author 20190313
 *
 */
public class Person implements Comparable {
    private int id;
    private String sname;
    private int age;

    public Person() {}

    public Person(int id, String sname, int age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getSname() {
        return sname;
    }


    public void setSname(String sname) {
        this.sname = sname;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
