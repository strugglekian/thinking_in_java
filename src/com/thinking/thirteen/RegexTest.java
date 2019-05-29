/**
 * @Author kkf7688
 * @Data 2019/4/19
 * @Version 1.0
 */

package com.thinking.thirteen;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    Pattern CUSTOMIZE_PUBLISH = Pattern.compile("/ss/user/(([\\w]+/?)+)[^/]$");//长度没有限制
    Pattern CUSTOMIZE_SUBSCRIBE = Pattern.compile("/ss/user/((([\\w]+)|(\\+))/)+#?");//没有判断长度以及不能/结尾#判断

    @Test
    public void testTopic() {
        String topic = "/ss/user/werwe/LklD";
        Matcher matcher = CUSTOMIZE_PUBLISH.matcher(topic);
        if (topic.length() <= 19 && matcher.matches()) {
            System.out.println(matcher.groupCount());
        }
    }

    @Test
    public void testTopicSubscribe() {
        String topic = "/ss/user/user/werwe/+/+/+/iilD/#";
        String[] topices = topic.split("/");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 2; i < topices.length; i++) {
            if (i != (topices.length - 1)) {
                stringBuffer.append(topices[i]).append("/");
            } else {
                stringBuffer.append(topices[i]);
            }
        }
        if (stringBuffer.length() > 64 ) {
            System.out.println("正则表达式不匹配");
        }
        System.out.println("stringBuffer:" + stringBuffer.toString());
        Matcher matcher = CUSTOMIZE_SUBSCRIBE.matcher(topic);
        if (matcher.matches()) {
            System.out.println("get");
            System.out.println(matcher.groupCount());
        }
    }
}
