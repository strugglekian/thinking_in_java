/**
 * @Author kkf7688
 * @Data 2019/1/9
 * @Version 1.0
 */

package com.thinking.thirteen;

public class TestString {
     String name;

    public TestString() {
    }

    public TestString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(args.length);
        String topic = "/sys/ayMXc4Ww/12345A/thing/command/cmd12_reply";
        System.out.println(topic.substring(0,topic.length()-6));
    }
}
