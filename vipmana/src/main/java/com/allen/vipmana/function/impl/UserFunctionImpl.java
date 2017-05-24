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

    @Override
    public User updatePassword(String id,String oldPassword, String newPassword,
                               String newPasswordConfirm)throws Exception {
        //1验证参数
        id=$("id未填写",id);
        oldPassword=$("原密码未填写",oldPassword);
        newPassword=$("新密码未填写",newPassword);
        newPasswordConfirm=$("确认密码填写",newPasswordConfirm);
        //2查询用户
        User user=userDao.select("id",id);
        if(user==null){

        }
        //3验证旧密码
        //4更新密码

        return null;
    }
}
