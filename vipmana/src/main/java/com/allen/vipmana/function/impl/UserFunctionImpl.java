package com.allen.vipmana.function.impl;

import static com.allen.common.AssertThrowUtil.*;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.dao.UserDao;
import com.allen.vipmana.entity.User;
import com.allen.vipmana.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by allen on 2017/5/10.
 */
@Service
public class UserFunctionImpl implements UserFunction {
    @Autowired
    private UserDao userDao;
    @Override
    public User login(String account, String password) throws Exception {
        account=$("账户不能为空",account);
        password=$("密码不能为空",password);

        User user=userDao.select("account",account);
        System.out.println("user=========");
        if(user==null){
            throw new ThisSystemException("账户不存在");
        }
        if(!user.getPassword().equals(password)){
            throw new ThisSystemException("密码错误");
        }



        return user;
    }
}
