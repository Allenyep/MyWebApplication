package servlet;

import dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除学生信息
 * Created by allen on 2017/12/28.
 */
@WebServlet("/deletestudent.do")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String sno=req.getParameter("sno");
            StudentDao studentDao=new StudentDao();
            studentDao.deleteById(sno);
            req.setAttribute("message","删除成功");
            req.getRequestDispatcher("/main.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
            req.setAttribute("message","删除失败");
            req.getRequestDispatcher("/main.jsp").forward(req,resp);
        }
    }
}
