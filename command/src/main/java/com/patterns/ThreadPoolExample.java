package com.patterns;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        int corePoolSize = 1;
        int maximumPoolSize = 1;
        long keepAliveTime = 10;
        TimeUnit unit = TimeUnit.SECONDS;
        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                workQueue);

        for (int i = 0; i < 6; i++) {
            System.out.println("task: " + i);
            executor.execute(new WorkerThread("cmd" + i));
        }

        executor.shutdown();
    }
}

class WorkerThread implements Runnable {
    private final String command;

    WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End.");
    }
}
