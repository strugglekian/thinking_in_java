/**
 * @Author kkf7688
 * @Data 2019/4/8
 * @Version 1.0
 */

package com.thinking.twentyone;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IndexThread {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newCachedThreadPool();
        executors.execute(new Accessor());
    }
}

class Accessor implements Runnable {

    @Override
    public void run() {
        ThreadLocalVariableHolder.increment();
    }
}

class ThreadLocalVariableHolder {
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        private Random random = new Random(47);

        protected synchronized Integer initial() {
            return random.nextInt(10000);
        }
    };

    public static void increment() {
        value.set(value.get() + 1);
    }

    public static int get() {
        return value.get();
    }
}


