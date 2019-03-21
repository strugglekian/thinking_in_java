/**
 * @Author kkf7688
 * @Data 2019/3/13
 * @Version 1.0
 */

package com.thinking.fourteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class SimpleProxy implements InvocationHandler {

    private Object proxied;

    public SimpleProxy(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理");
        return method.invoke(proxy,args);
    }
}
