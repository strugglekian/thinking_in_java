/**
 * @Author kkf7688
 * @Data 2019/2/13
 * @Version 1.0
 */

package com.thinking.thirteen;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAppend {

    @Test
    public void appendTest() {
        String s = "sdfsifhqwoeiiuoznouweirsnd";
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(s);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group().toUpperCase());
            System.out.println("1111:=======" + stringBuffer);
        }
        matcher.appendTail(stringBuffer);
        System.out.println("2222:=======" + stringBuffer);
/***
 * 举例，先matcher一个空字符串，然后通过循环reset方法，加载具体的matcher内容，这样有一定的性能优化
 */
        Matcher m = pattern.matcher("");
        while (m.find()) {
            for (int i = 0; i < s.length(); i++) {
                m.reset(s.substring(i, i + 1));
            }
        }

    }
}
