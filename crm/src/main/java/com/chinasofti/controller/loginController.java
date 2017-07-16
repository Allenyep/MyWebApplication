package com.chinasofti.controller;

import com.chinasofti.po.User;
import com.chinasofti.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by allen on 2017/6/23.
 */
@Controller
public class loginController {
    @Autowired
    userService userService;

    @RequestMapping("/login.do")
    public String login(String username, String password, HttpSession session)throws Exception{
        try {
            User user=userService.login(username,password);
            String name= user.getName();
            session.setAttribute("name",name);
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("message",e.getMessage());
            return "forward:login.jsp";
        }
        return "index";
    }
}
