package com.ny.dynamicproxy.impl;

import com.ny.dynamicproxy.service.UserService;

/**
 * @author wenan.ren
 * @date 2023/7/10 17:45
 * @Description
 */
public class BUserServiceImpl implements UserService {
    @Override
    public void add(String userName) {
        System.out.println("BUserServiceImpl add userName:" + userName);
    }
}
