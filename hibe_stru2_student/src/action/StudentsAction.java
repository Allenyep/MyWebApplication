package action;

import entity.Students;
import service.StudentsDao;
import service.impl.StudentsDaoImpl;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by allen on 2017/5/3.
 */
//学生Action类
public class StudentsAction extends SuperAction {
    private static final long serialVersion=1L;
    //查询所有学生动作
    public String query(){
        StudentsDao sDao=new StudentsDaoImpl();
        List<Students> list=sDao.queryAllStudents();
        if(list!=null&&list.size()>0){
            session.setAttribute("students_list",list);

        }
        return "query_success";
    }

    //根据学号删除学生
    public String delete(){
        StudentsDao sDao=new StudentsDaoImpl();
        String sid=request.getParameter("sid");
        sDao.deleteStudents(sid);
        return "delete_success";
    }

    //修改学生资料
    public String modify(){
        String sid=request.getParameter("sid");
        StudentsDao sDao=new StudentsDaoImpl();
        Students stu=sDao.queryStudentById(sid);
        session.setAttribute("modify_student",stu);
        return "modify_success";
    }

    //添加学生
    public String add() throws Exception{
        Students s=new Students();
        s.setSname(request.getParameter("sname"));
        s.setGender(request.getParameter("gender"));

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        s.setBirthday(sdf.parse(request.getParameter("birthday")));
        s.setAddress(request.getParameter("address"));
        StudentsDao sDao=new StudentsDaoImpl();
        sDao.addStudents(s);
        return "add_success";
    }


    //保存修改后学生资料
    public String save() throws Exception{
        Students s=new Students();
        s.setSid(request.getParameter("sid"));
        s.setSname(request.getParameter("sname"));
        s.setGender(request.getParameter("gender"));
        System.out.println(request.getParameter("birthday"));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        s.setBirthday(sdf.parse(request.getParameter("birthday")));
        s.setAddress(request.getParameter("address"));
        StudentsDao sDao=new StudentsDaoImpl();
        sDao.updateStudents(s);
        return "save_success";
    }
}
