package dao;

import entity.Admin;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 管理员连接持久层
 * Created by allen on 2017/12/26.
 */
public class AdminDao {
    public Admin login(String username, String password)throws Exception{
        Connection connection= DBUtil.getConnection();
        StringBuilder sql=new StringBuilder();
        sql.append("select * from admin where username=? and password=?;");
//        System.out.println(sql.toString());
        PreparedStatement ps = connection.prepareStatement(sql.toString());
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return this.row2entity(rs);
        }
        return null;
    }

    private Admin row2entity(ResultSet rs) throws Exception{
        Admin cp=new Admin();
        cp.setUsername(rs.getString("username"));
        cp.setPassword(rs.getString("password"));
        System.out.println(cp.toString());
        return cp;
    }
}
