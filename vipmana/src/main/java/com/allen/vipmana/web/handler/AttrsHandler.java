package com.allen.vipmana.web.handler;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.entity.Attrs;
import com.allen.vipmana.function.AttrsFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

/**
 * Created by allen on 2017/6/6.
 */
@Controller
public class AttrsHandler {

    @Autowired
    AttrsFunction attrsFunction;


    @RequestMapping(path = "/usermainattrs.do", method = RequestMethod.GET)
    public String usermainattrsByGet(HttpServletRequest req) throws Exception {
        //获取labelId userId
        int labelId = Integer.parseInt(req.getParameter("labelId"));
        List<Attrs> attrsList = attrsFunction.qureyByLabelId(labelId);
        HttpSession session = req.getSession();
        if (attrsList == null) {
            throw new ThisSystemException("属性读取错误");
        }
        session.setAttribute("labelId", labelId);
        session.setAttribute("attrsList", attrsList);
        return "vip/usermainattrs";
    }

    @RequestMapping(path = "/userattradd.do", method = RequestMethod.GET)
    public String userAttrAddView() throws Exception {
        return "vip/add";
    }

    @RequestMapping(path = "/userattradd.do", method = RequestMethod.POST)
    public String userAttrAdd(String attrName, String attrURL, HttpServletRequest req) throws Exception {
        //控制器负责数据的转发和页面的跳转,具体的业务处理放到服务中
        HttpSession session = req.getSession();
        int labelId = (Integer) session.getAttribute("labelId");
        try {
            attrsFunction.insert(attrName, attrURL, labelId);
        } catch (ThisSystemException e) {
            session.setAttribute("message", e.getMessage());
        }
        session.setAttribute("message", "成功添加新标签");
        return "vip/message";
    }

    @RequestMapping(path = "/userattrupdate.do",method = RequestMethod.GET)
    public String userAttrUpdateView(String attrName,String attrURL,int attrId,HttpSession session)throws Exception{
        Attrs attr=new Attrs();
        attrName=new String(attrName.getBytes("ISO-8859-1"),"UTF-8");
        attr.setAttrId(attrId);
        attr.setAttrName(attrName);
        attr.setAttrURL(attrURL);
        session.setAttribute("attr",attr);
        return "vip/update";
    }

    @RequestMapping(path = "/userattrupdate.do",method = RequestMethod.POST)
    public String userAttrUpdate(String attrName,String attrURL,int attrId,HttpSession session)throws Exception{
//        System.out.println(attrId);
        try {
            attrsFunction.update(attrName,attrURL,attrId);
            session.setAttribute("message","标签修改成功");
        }catch (ThisSystemException e){
            session.setAttribute("message",e.getMessage());
        }
        return "vip/message";
    }

    @RequestMapping(path = "/userattrdelete.do",method = RequestMethod.GET)
    public String userAttrDelete(int attrId,HttpSession session)throws Exception{
        try{
            attrsFunction.deleteById(attrId);
            System.out.println("test==========delete");
            session.setAttribute("message","删除成功");
        }catch (ThisSystemException e){
            e.printStackTrace();
            session.setAttribute("message","删除失败");
        }
        return "vip/message";
    }
}
