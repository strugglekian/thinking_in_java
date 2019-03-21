/**
 * @Author kkf7688
 * @Data 2019/2/13
 * @Version 1.0
 */

package com.thinking.fourteen;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class One {
    @Test
    public void testRTTI(){
        List<Shapes> shapesList = Arrays.asList(new Triangle());
        try {
            Class c = Class.forName("com.thinking.fourteen.One");
            Object o = c.newInstance();
            System.out.println(o.getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    abstract class Shapes{
         void draw(){}

        public abstract String toString();
    }

    class Triangle extends Shapes{
        @Override
        public String toString() {
            return "triangle";
        }
    }
 }
