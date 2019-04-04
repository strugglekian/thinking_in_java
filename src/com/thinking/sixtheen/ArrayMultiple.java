/**
 * @Author kkf7688
 * @Data 2019/3/28
 * @Version 1.0
 */

package com.thinking.sixtheen;


import java.util.Arrays;


public class ArrayMultiple {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[][] aa = {{1,2},{2,4,5}};
        System.out.println(aa[0][1]);
        int[][][] aaa = {{{1,2,3},{23,12,31},{43,35,54}}};
        Arrays.fill(a,888);
        System.out.println(Arrays.toString(a));
    }
}


