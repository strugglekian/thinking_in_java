package com.thinking.seven;

import java.util.ArrayList;

/**
 * private方法隐藏了final方法
 * private修饰的方法不能重写，但是重写也不会报错，所以尽量在子类中不要用相同的方法名字造成误解
 */
public class LearnFinal {
    public static void main(String[] args) {
        new ArrayList<>();

    }
}

class WithFinal {
    protected int j = 0;

    private final void f() {
        System.out.println("this is withFinal");
    }
}

class OverridePrivate extends WithFinal {
    protected int j = 3;

    public static void main(String[] args) {
        new OverridePrivate().f();
    }

    private final void f() {
        System.out.println(j);
        System.out.println("this is overridePrivate");
    }
}