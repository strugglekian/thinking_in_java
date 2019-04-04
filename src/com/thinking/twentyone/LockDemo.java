/**
 * @Author kkf7688
 * @Data 2019/4/4
 * @Version 1.0
 */

package com.thinking.twentyone;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        //可以判断加锁成功还是失败
        Boolean isLock = lock.tryLock();
        try {
            //可以设置加锁的时间
            lock.tryLock(200L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
