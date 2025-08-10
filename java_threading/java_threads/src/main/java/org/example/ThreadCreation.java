package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println("hello world from thread " + Thread.currentThread().getName());

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 20; i++) {
            executorService.execute(runnable);
        }


        executorService.awaitTermination(5, TimeUnit.SECONDS);

        executorService.close();



    }

}