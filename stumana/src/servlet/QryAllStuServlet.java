package servlet;

import dao.StudentDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 学生信息全部查询
 * Created by allen on 2017/12/27.
 */
@WebServlet("/queryall.do")
public class QryAllStuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //1 获取参数
            req.setCharacterEncoding("utf-8");
            //2 验证参数
            //3 执行业务逻辑
            StudentDao dao=new StudentDao();
            List<Student> stuData=dao.selectAll();
            for(Student s:stuData){
                System.out.println(s);
            }
            req.setAttribute("stuData",stuData);
            req.getRequestDispatcher("/main.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
