package com.example.demo.design.factoryMethod;

/**
 * 算法父类
 */
public abstract class AbstractTest {
    private double a;
    private double b;

    public abstract void getValue();


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
