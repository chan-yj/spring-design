package com.example.demo.design.proxy;

public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Girl("xiaoxiao"));
        proxy.food();
    }
}
