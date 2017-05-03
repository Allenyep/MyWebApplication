package service.impl;

import entity.Users;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by allen on 2017/5/2.
 */
public class TestUserDaoImpl {
    @Test
    public void testUsersLogin(){
        Users u=new Users("1","admin","123");
        System.out.println(u);
        UsersDaoImpl usersDao=new UsersDaoImpl();
        Assert.assertEquals(true,usersDao.userslogin(u));
    }
}
