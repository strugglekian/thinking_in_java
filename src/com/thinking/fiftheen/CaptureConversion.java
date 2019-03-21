/**
 * @Author kkf7688
 * @Data 2019/3/21
 * @Version 1.0
 */

package com.thinking.fiftheen;


import java.lang.reflect.Array;

public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.getItem();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        System.out.println("======f2======");
        f1(holder);
    }

    public static void main(String[] args) {
        Holder<Integer> holder = new Holder<>(1);
        f1(holder);
        f2(holder);
    }
}

class Holder<T> {
    T item;

    public Holder(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}