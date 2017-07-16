package com.chinasofti.service;

import com.chinasofti.po.User;
import org.springframework.stereotype.Service;

/**
 * Created by allen on 2017/6/23.
 */
public interface userService {
    //用户登录
    public User login(String account,String password)throws Exception;
}
