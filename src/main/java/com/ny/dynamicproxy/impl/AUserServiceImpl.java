package com.ny.dynamicproxy.impl;

import com.ny.dynamicproxy.service.UserService;

/**
 * @author wenan.ren
 * @date 2023/7/10 17:37
 * @Description
 */
public class AUserServiceImpl implements UserService {

    @Override
    public void add(String userName) {
        System.out.println("AUserServiceImpl add userName:" + userName);
    }
}
