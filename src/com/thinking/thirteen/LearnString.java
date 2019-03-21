/**
 * @Author kkf7688
 * @Data 2019/1/4
 * @Version 1.0
 */

package com.thinking.thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnString {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("((asb)([0-9]?)([a-zA-Z]{2}))");
        Matcher matcher = pattern.matcher("asb0oo");
        // 按指定模式在字符串查找
//        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(\\D*)(\\d+)(.*)";
//        Pattern r = Pattern.compile(pattern);
//        Matcher matcher = r.matcher(line);
        System.out.println("group:" + matcher.groupCount());
        if (matcher.find()) {
            System.out.println("group0:" + matcher.group(0));
            System.out.println("group1:" + matcher.group(1));
            System.out.println("group2:" + matcher.group(2));
            System.out.println("group3:" + matcher.group(3));
            System.out.println("group4:" + matcher.group(4));
        }
//查找input中的多个匹配
        if (matcher.find()) {
            System.out.println("group:" + matcher.group());
            System.out.println("start:" + matcher.start());
            System.out.println("end:" + (matcher.end() - 1));
            System.out.println("group count:" + matcher.groupCount());
        }
        System.out.println("==================");
        if (matcher.lookingAt()) {
            System.out.println("group:" + matcher.group());
            System.out.println("start:" + matcher.start());
            System.out.println("end:" + (matcher.end() - 1));
            System.out.println("group count:" + matcher.groupCount());
        }
        System.out.println("==================");
        if (matcher.matches()) {
            System.out.println("group:" + matcher.group());
            System.out.println("start:" + matcher.start());
            System.out.println("end:" + (matcher.end() - 1));
            System.out.println("group count:" + matcher.groupCount());
        }
    }

    public void method() {

    }
}
