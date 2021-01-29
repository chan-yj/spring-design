package com.example.demo.design.strategy;

public class Test {
    public static void main(String[] args) {
        Context contextA = new Context(new ConcreteStrategyA());
        Context contextB = new Context(new ConcreteStrategyB());
        contextA.contextInterface();
        contextB.contextInterface();

//        Strategy contextA = new ConcreteStrategyA();
//        contextA.algorithmMethod();

    }
}
