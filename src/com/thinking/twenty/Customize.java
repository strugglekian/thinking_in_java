/**
 * @Author kkf7688
 * @Data 2019/4/1
 * @Version 1.0
 */

package com.thinking.twenty;

public class Customize {
    @CustomizeInterface
    public String defaultString;

    public String getContent() {
        return defaultString;
    }


    public static void main(String[] args) {
        Customize customize = new Customize();
        System.out.println(customize.defaultString);
    }
}
