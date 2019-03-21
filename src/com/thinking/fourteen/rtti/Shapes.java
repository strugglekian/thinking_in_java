/**
 * @Author kkf7688
 * @Data 2019/3/14
 * @Version 1.0
 */

package com.thinking.fourteen.rtti;

import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(),new Triangle());
        for (Shape s:shapeList){
            s.drawing();
        }
    }
}
/* Output:
Circle.drawing
Triangle.drawing
*///:~

abstract class Shape {
    void drawing() {
        System.out.println(this + ".drawing");
    }

    abstract public String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle";
    }
}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle";
    }
}