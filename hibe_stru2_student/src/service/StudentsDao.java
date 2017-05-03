package service;

import entity.Students;

import java.util.List;

/**
 * Created by allen on 2017/5/3.
 */

//学生业务逻辑接口
public interface StudentsDao {
    //查询所有学生资料
    public List<Students> queryAllStudents();

    //按编号查询学生
    public Students queryStudentById(String sid);

    //添加学生资料
    public boolean addStudents(Students s);

    //修改学生资料
    public boolean updateStudents(Students s);

    //删除学生资料
    public boolean deleteStudents(String sid);
}
