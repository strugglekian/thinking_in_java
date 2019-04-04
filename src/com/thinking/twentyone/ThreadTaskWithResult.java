/**
 * @Author kkf7688
 * @Data 2019/4/4
 * @Version 1.0
 */

package com.thinking.twentyone;

import org.junit.Assert;

import java.util.concurrent.*;

//Run方法没有返回值，如果需要返回值则实现该方法
public class ThreadTaskWithResult implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "this is thread callback!";
    }
}

class CallBackResult{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> reuslt = executorService.submit(new ThreadTaskWithResult());
        try {
            TimeUnit.SECONDS.sleep(1);
            //判断回调是否已经完成
            Assert.assertTrue(reuslt.isDone());
            System.out.println(reuslt.get());
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

