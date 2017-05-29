package com.allen.vipmana.web.handler;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.entity.User;
import com.allen.vipmana.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by allen on 2017/5/10.
 */
@Controller
public class LoginHandler {
    @Autowired
    private UserFunction userFunction;

    @RequestMapping("/login.do")
    private String login(String account, String password, HttpServletRequest request){
        System.out.println("login -------");
        try {
            User user=userFunction.login(account,password);
            System.out.println("user-0-----");
            HttpSession session=request.getSession();
            session.setAttribute("currentUser",user);
        }catch (Exception e){
            request.setAttribute("message",e.getMessage());
            e.printStackTrace();
            return "forward:/login.jsp";
        }
        return "redirect:/index.do";

    }

    @RequestMapping("/index.do")
    private String index(){
        return "index";
    }

    @RequestMapping("/welcome.do")
    private String welcome(){
        return "welcome";
    }

    @RequestMapping("/logout.do")
    private String logout(HttpSession session){
        //清空session
        session.invalidate();
        return "redirect:/login.jsp";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/updatepassword.do")
    private String updatepasswordView(){

        return "updatepassword";
    }

    @RequestMapping(method = RequestMethod.POST,path = "/updatepassword.do")
    private String updatepassword(String oldPassword, String newPassword, String newPasswordConfirm,
                                  HttpServletRequest request)throws Exception{
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("currentUser");
        try {
            userFunction.updatePassword(user.getId(),oldPassword,newPassword,newPasswordConfirm);
        }catch (ThisSystemException e){
            request.setAttribute("message",e.getMessage());
            return "updatepassword";
        }
        session.setAttribute("message","修改密码成功");
        return "redirect:/login.jsp";
    }
}
