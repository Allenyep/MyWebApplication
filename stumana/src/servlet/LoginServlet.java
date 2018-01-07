package servlet;

import dao.AdminDao;
import entity.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录处理类
 * Created by allen on 2017/12/26.
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String pwd=req.getParameter("password");
        System.out.println(username+" "+pwd);//输出
        AdminDao adminDao=new AdminDao();
        try {
            Admin admin=adminDao.login(username,pwd);
            if(admin!=null){
                System.out.println(username+" "+pwd);
                req.setAttribute("username",username);
                resp.sendRedirect(req.getContextPath()+"/main.jsp");
            }else {
                req.setAttribute("message","密码不对");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
