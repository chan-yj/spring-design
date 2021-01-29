package com.example.demo.juc;

import java.util.concurrent.*;

public class FutureTaskTest {

    public static void main(String[] args) throws Exception {


        //提交任务
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                System.out.println("Callable start!");
                Thread.sleep(2000);

                for(int i=0 ;i<5000;i++){
                    sum=sum+i;
                }
                System.out.println("Callable end!");
                return sum;
            }
        };

        //FutureTask执行任务
        //FutureTask futureTask = new FutureTask(callable);
        //启动线程
        //Thread thread = new Thread(futureTask,"one");
        //thread.start();

        //任务执行机制的核心接口Executor，以及继承自Executor的ExecutorService接口。
        //Executor框架有两个关键类实现了ExecutorService接口（ThreadPoolExecutor和ScheduledThreadPoolExecutor）
        //SingleThreadExecutor用于需要保证顺序地执行各个任务；并且在任意时间点，不会有多个线程是活动的应用场景。
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> futureTask = executorService.submit(callable);
        executorService.shutdown();


        Thread.sleep(2000);
        System.out.println("main start");


        if(futureTask.get()!=null){
            //输出获取到的结果
            System.out.println("future.get()-->"+futureTask.get());
        }else{
            //输出获取到的结果
            System.out.println("future.get() not get result");
        }


        System.out.println("main end");

    }






}
