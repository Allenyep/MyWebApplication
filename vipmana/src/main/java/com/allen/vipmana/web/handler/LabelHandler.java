package com.allen.vipmana.web.handler;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.entity.Label;
import com.allen.vipmana.entity.User;
import com.allen.vipmana.function.LabelFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

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
            session.setAttribute("message",e.getMessage());
        }
        return "vip/usermain";
    }

    @RequestMapping(path = "/userLabelInsert.do",method = RequestMethod.POST)
    public String userLabelInsert(String labelName, HttpServletRequest req)throws Exception{
        Label label=new Label();
        labelName=new String(labelName.getBytes("ISO-8859-1"),"UTF-8");
        label.setLabelName(labelName);
        HttpSession session=req.getSession();
        User u= (User) session.getAttribute("currentUser");
        label.setUserId(Integer.parseInt(u.getId()));
        label.setLabelColorId(new Random().nextInt(5)+1);
        labelFunction.insert(label);
        req.setAttribute("message","插入成功");
        return "redirect:vip/usermain.do";
    }

    @RequestMapping(path = "/userLabelDelete.do")
    public String userLabelDelete(String labelId)throws Exception{
        //TODO: 删除label必须删除对应label下的所有attr属性
        labelFunction.delete(Integer.parseInt(labelId));
        return "vip/usermainattrs";
    }


}
