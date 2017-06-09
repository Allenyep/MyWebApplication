package com.allen.vipmana.web.handler;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.entity.Attrs;
import com.allen.vipmana.entity.Label;
import com.allen.vipmana.entity.User;
import com.allen.vipmana.function.AttrsFunction;
import com.allen.vipmana.function.LabelFunction;
import com.allen.vipmana.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by allen on 2017/5/10.
 */
@Controller
public class LoginHandler {
    @Autowired
    private UserFunction userFunction;

    @Autowired
    private LabelFunction labelFunction;

    @Autowired
    private AttrsFunction attrsFunction;

    @RequestMapping("/login.do")
    private String login(String account, String password, HttpServletRequest request){
        System.out.println("login -------");
        HttpSession session=request.getSession();
        try {
            User user=userFunction.login(account,password);
            int userId=Integer.parseInt(user.getId());
            List<Label> labellist=labelFunction.queryAllLabel(userId);
            List<Attrs> attrsList=attrsFunction.queryAllAttr();
//            System.out.println(labellist);     TYT
//            System.out.println(attrsList);
            session.setAttribute("labels",labellist);
            session.setAttribute("currentUser",user);
            session.setAttribute("attrs",attrsList);
        }catch (Exception e){
            request.setAttribute("message",e.getMessage());
            e.printStackTrace();
            return "forward:/login.jsp";
        }
        return "userindex";

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

    @RequestMapping(method = RequestMethod.GET,path = "/userindex.do")
    private String userindex(){
        return "userindex";
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

    @RequestMapping(method = RequestMethod.POST,path = "/register.do")
    private String register(HttpServletRequest req,String name,String account,String password,String passwordConfirm)throws Exception{
        try{
            userFunction.insert(name, account, password, passwordConfirm);
        }catch (ThisSystemException e) {
            req.setAttribute("message",e.getMessage());
            e.printStackTrace();
            return "forward:/login.jsp";
        }
        req.setAttribute("message","注册成功");
        return "forward:/login.jsp";
    }
}
