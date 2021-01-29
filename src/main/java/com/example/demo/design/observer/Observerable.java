package com.example.demo.design.observer;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *  被观察者所具备的功能
 */
public interface Observerable {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}