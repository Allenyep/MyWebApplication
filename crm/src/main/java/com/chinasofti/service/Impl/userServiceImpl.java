package com.chinasofti.service.Impl;

import com.chinasofti.dao.userDao;
import com.chinasofti.po.User;
import com.chinasofti.service.userService;
import com.chinasofti.util.ThisSystemException;
import com.chinasofti.util.ThisSystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.chinasofti.util.AssertThrowUtil.$;

/**
 * Created by allen on 2017/6/23.
 */
@Service
public class userServiceImpl implements userService {
    @Autowired
    userDao userDao;

    @Override
    public User login(String t_account, String t_password) throws Exception {
        t_account=$("账户不能为空",t_account);
        t_password=$("密码不能为空", t_password);
        System.out.println(t_account);
        User user=userDao.select(t_account);
        System.out.println("user=========");
        if(user==null){
            throw new ThisSystemException("账户不存在");
        }
        if(!user.getPassword().equals(t_password)){
            throw new ThisSystemException("密码错误");
        }
        return user;
    }


}
