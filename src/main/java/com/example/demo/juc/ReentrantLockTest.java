package com.example.demo.juc;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockTest {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    }
}
