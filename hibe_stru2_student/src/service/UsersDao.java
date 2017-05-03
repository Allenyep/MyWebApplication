package service;

import entity.Users;

/**
 * Created by allen on 2017/5/2.
 */

//业务逻辑接口
public interface UsersDao {

    //用户登录
    public boolean userslogin(Users u);


}
