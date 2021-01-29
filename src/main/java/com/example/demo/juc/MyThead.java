package com.example.demo.juc;

public class MyThead extends Thread{

    private String threadName;

    public MyThead(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        System.out.println("my thread run..."+thread);
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }


}


