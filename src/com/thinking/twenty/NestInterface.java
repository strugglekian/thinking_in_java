package com.thinking.twenty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 *注解中嵌套注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NestInterface {
    CustomizeInterface customizeInterface() default @CustomizeInterface(defaultString="嵌套注解初始化");
}
