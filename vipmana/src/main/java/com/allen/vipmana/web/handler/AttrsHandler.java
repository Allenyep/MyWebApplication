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

/**
 * Created by allen on 2017/6/6.
 */
@Controller
public class AttrsHandler {

    @Autowired
    AttrsFunction attrsFunction;


    @RequestMapping(path = "/usermainattrs.do",method = RequestMethod.GET)
    public String usermainattrsByGet(HttpServletRequest req)throws Exception{
        //获取labelId userId
        int labelId= Integer.parseInt(req.getParameter("labelId"));
        List<Attrs> attrsList=attrsFunction.qureyByLabelId(labelId);
        HttpSession session=req.getSession();
        if(attrsList==null){
            throw new ThisSystemException("属性读取错误");
        }
        session.setAttribute("labelId",labelId);
        session.setAttribute("attrsList",attrsList);
        return "vip/usermainattrs";
    }
}
