/**
 * @Author kkf7688
 * @Data 2019/4/4
 * @Version 1.0
 */

package com.thinking.twentyone;

import java.util.concurrent.*;

public class ThreadWithPool implements Runnable {
    private static ExecutorService executorService = new ThreadPoolExecutor(2, 4, 600, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());

    @Override
    public void run() {
        System.out.println("这里是多线程！");
        Thread.yield();
    }



    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadWithPool());
        thread.start();
        System.out.println("this is another thread!");
        executorService.shutdown();
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
    }
}



