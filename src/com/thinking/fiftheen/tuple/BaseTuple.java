/**
 * @Author kkf7688
 * @Data 2019/3/14
 * @Version 1.0
 */

package com.thinking.fiftheen.tuple;

public class BaseTuple<BaseA,BaseB> {
    public final BaseA a;
    public final BaseB b;

    public BaseTuple(BaseA a, BaseB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "BaseTuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
