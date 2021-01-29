package com.example.demo.juc;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyTheadTest {

    public static class MyLock {
        private AtomicBoolean locked = new AtomicBoolean(false);

        public boolean lock() {
            return locked.compareAndSet(false, true);
        }


    }

    public static void main(String[] args) {
        System.out.println("main run...");
        MyThead myThead = new MyThead("first Thread");
        myThead.start();

    }
}
