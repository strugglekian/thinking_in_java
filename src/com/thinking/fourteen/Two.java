/**
 * @Author kkf7688
 * @Data 2019/2/13
 * @Version 1.0
 */

package com.thinking.fourteen;

import com.thinking.thirteen.TestString;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Two {


    @Test
    public void testPet() {
        try {
            Class<?> aClass = Class.forName("com.thinking.thirteen.TestString");
            Method[] methods = aClass.getMethods();
            for (Method m:methods ) {
                Class<?>[] parameters = m.getParameterTypes();
                for (Class p:parameters ) {
                    System.out.println("参数名字："+p.getName());
                }

                System.out.println(m.getName());
            }
            System.out.println("============method==========");
            Constructor<?>[] constructors = aClass.getConstructors();
            for (Constructor c:constructors ) {
                System.out.println(c.getName());
            }
            System.out.println("==========Constructor==========");
            Field[] fields = aClass.getDeclaredFields();
            for (Field f:fields ) {
                System.out.println(f.getName());
            }
            System.out.println("==========Field==========");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
