package servlet;

import dao.StudentDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 修改学生信息
 * Created by allen on 2017/12/28.
 */
@WebServlet("/updatestudent.do")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            //获取参数
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=UTF-8");
            String sno= req.getParameter("sno");
            String sname=req.getParameter("sname");
            String ssex=req.getParameter("ssex");
            String sdate=req.getParameter("sdate");
            String smajor=req.getParameter("smajor");
            Student stu=new Student(sno,sname,ssex,sdate,smajor);
            System.out.println(stu);

            StudentDao studentDao=new StudentDao();
            studentDao.update(stu);
            req.setAttribute("message","修改成功");
            req.getRequestDispatcher("/main.jsp").forward(req,resp);

        }catch (Exception e){
            e.printStackTrace();
            req.setAttribute("message","修改失败");
            req.getRequestDispatcher("/main.jsp").forward(req,resp);
        }
    }
}
