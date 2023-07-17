package com.ny.dynamicproxy;

import com.ny.dynamicproxy.handler.MyInvocationHandler;
import com.ny.dynamicproxy.impl.AUserServiceImpl;
import com.ny.dynamicproxy.impl.BUserServiceImpl;
import com.ny.dynamicproxy.service.UserService;

import java.lang.reflect.Proxy;

/**
 * @author wenan.ren
 * @date 2023/7/10 17:41
 * @Description
 */
public class DynamicProxyMain {

    public static void main(String[] args) {
        UserService userService = new AUserServiceImpl();

        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(DynamicProxyMain.class.getClassLoader(), userService.getClass().getInterfaces(), invocationHandler);

        userServiceProxy.add("renwn");


        UserService bUserService = new BUserServiceImpl();

        MyInvocationHandler invocationHandler01 = new MyInvocationHandler(bUserService);

        UserService userServiceProxy01 = (UserService) Proxy.newProxyInstance(DynamicProxyMain.class.getClassLoader(), bUserService.getClass().getInterfaces(), invocationHandler01);

        userServiceProxy01.add("hany");
    }
}
