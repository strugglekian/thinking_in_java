/**
 * @Author kkf7688
 * @Data 2019/3/14
 * @Version 1.0
 */

package com.thinking.fiftheen.tuple;

public class ThreeTuple<BaseA,BaseB,BaseC> extends BaseTuple<BaseA,BaseB> {
    private final BaseC c;

    public ThreeTuple(BaseA a,BaseB b,BaseC c) {
        super(a,b);
        this.c = c;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "c=" + c +
                ", a=" + a +
                ", b=" + b +
                '}';
    }



}

