package dao;

import entity.Student;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 学生信息持久层
 * Created by allen on 2017/12/27.
 */

public class StudentDao {
    public List<Student> selectAll()throws Exception{
        List<Student> result=new LinkedList<>();
        Connection connection= DBUtil.getConnection();
        StringBuilder sql=new StringBuilder();
        sql.append("select * from student order by sno");
        PreparedStatement ps = connection.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            result.add(this.row2entity(rs));
        }
        return result;
    }

    public Student insert(String sno,String sname,String ssex,String sdate,String smajor)throws Exception{
        Connection connection = DBUtil.getConnection();
        //构建SQL语句
        StringBuilder sql = new StringBuilder();
        sql.append("insert into student")
                .append("(sno,sname,ssex,sdate,smajor)")
                .append("values").append("(?,?,?,?,?)");
        // 4传入sql参数，执行sql
        PreparedStatement ps = connection.prepareStatement(sql.toString());
        int i = 1;
        ps.setString(i++,sno);
        ps.setString(i++,sname);
        ps.setString(i++,ssex);
        ps.setString(i++,sdate);
        ps.setString(i,smajor);
        // 执行
        ps.executeUpdate();// 增删改
        return null;
    }

    public Student deleteById(String sno)throws Exception{
        Connection connection = DBUtil.getConnection();
        StringBuilder sql = new StringBuilder();
        sql.append("delete from student where sno=?");
        PreparedStatement ps = connection.prepareStatement(sql.toString());
        ps.setString(1, sno);
        // 执行
        ps.executeUpdate();
        return null;
    }

    public Student update(Student stu)throws Exception{
        Connection connection = DBUtil.getConnection();
        //构建SQL语句
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE student")
                .append(" set sname=?,ssex=?,sdate=?,smajor=? ")
                .append(" where sno=?");
        // 4传入sql参数，执行sql
        PreparedStatement ps = connection.prepareStatement(sql.toString());
        int i = 1;
        ps.setString(i++,stu.getSname());
        ps.setString(i++,stu.getSsex());
        ps.setString(i++,stu.getSdate());
        ps.setString(i++,stu.getSmajor());
        ps.setString(i,stu.getSno());
        // 执行
        ps.executeUpdate();// 增删改
        return null;
    }

    private Student row2entity(ResultSet rs) throws Exception{
        Student cp=new Student();
        cp.setSno(rs.getString("sno"));
        cp.setSname(rs.getString("sname"));
        cp.setSsex(rs.getString("ssex"));
        cp.setSdate(rs.getString("sdate"));
        cp.setSmajor(rs.getString("smajor"));
        return cp;
    }
}
