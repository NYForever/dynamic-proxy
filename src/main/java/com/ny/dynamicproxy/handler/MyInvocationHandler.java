package com.ny.dynamicproxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wenan.ren
 * @date 2023/7/10 17:38
 * @Description
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy before");
        Object result = method.invoke(target, args);
        System.out.println("proxy after");
        return result;
    }
}
