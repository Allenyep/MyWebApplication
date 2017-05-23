package com.allen.vipmana.function;

import com.allen.vipmana.entity.User;

/**
 * Created by allen on 2017/5/10.
 */
public interface UserFunction {
    public User login(String account,String password)throws Exception;
}
