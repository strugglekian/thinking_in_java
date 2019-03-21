/**
 * @Author kkf7688
 * @Data 2019/3/15
 * @Version 1.0
 */

package com.thinking.fiftheen.generator;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;

public class BasicGenerator<T> {
    public static void main(String[] args) {
        Set<Colour> set = EnumSet.range(Colour.YELLOW,Colour.WHITE);
        System.out.println(set);

        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1==c2);
        System.out.println(c1);
    }

    enum Colour {
        RED, BLACK,YELLOW,GREEN,WHITE
    }
}
