package com.example.demo.juc;

import java.util.ArrayList;

public class Test {

    static class People{
        private String name;
        private String mail;

        public People(String name, String mail) {
            this.name = name;
            this.mail = mail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", mail='" + mail + '\'' +
                    '}';
        }
    }



    public static void main(String[] args) {

        ArrayList<People> list = new ArrayList<People>();
        String name1 = "chr1";
        String name2 = "chr2";
        String name3 = "chr3";
        String name4 = "chr4";

        String mail1 = "qq1";
        String mail2 = "qq2";
        String mail3 = "qq3";
        String mail4 = "qq4";

        list.add(new People(name1,mail1));
        list.add(new People(name2,mail2));
        list.add(new People(name3,mail3));
        list.add(new People(name4,mail4));

        System.out.println(list);
        for(People people:list){
            String replace = people.getMail().replace("qq", "邮件");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("name===="+people.getName()+"=====mail==="+replace);
                }
            }).start();
        }


    }
}
