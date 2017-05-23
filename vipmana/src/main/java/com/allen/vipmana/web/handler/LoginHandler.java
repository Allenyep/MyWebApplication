package com.allen.vipmana.web.handler;

import com.allen.vipmana.entity.User;
import com.allen.vipmana.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
