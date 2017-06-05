package com.allen.vipmana.web.handler;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.entity.Label;
import com.allen.vipmana.entity.User;
import com.allen.vipmana.function.LabelFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by allen on 2017/6/5.
 */
@Controller
public class LabelHandler {

    @Autowired
    LabelFunction labelFunction;

    @RequestMapping(path = "/vip/usermain.do")
    public String usermain(HttpSession session)throws  Exception{
        User u= (User) session.getAttribute("currentUser");
        int userId=Integer.parseInt(u.getId());
        try {
           List<Label> list=labelFunction.queryAllLabel(userId);
           session.setAttribute("labels",list);
        } catch (ThisSystemException e) {
            e.printStackTrace();
            session.setAttribute("mess",e.getMessage());
        }
        return "vip/usermain";
    }


}
