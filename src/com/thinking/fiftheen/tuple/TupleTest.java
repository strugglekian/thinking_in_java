/**
 * @Author kkf7688
 * @Data 2019/3/14
 * @Version 1.0
 */

package com.thinking.fiftheen.tuple;

import java.util.Random;

public class TupleTest {
    static ThreeTuple<BaseA, BaseB, BaseC> three(){
        return new ThreeTuple<>(new BaseA(),new BaseB(),new BaseC());
    }

}
