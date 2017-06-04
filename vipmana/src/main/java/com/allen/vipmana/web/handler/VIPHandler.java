package com.allen.vipmana.web.handler;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.entity.VIP;
import com.allen.vipmana.function.VIPFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by allen on 2017/5/30.
 */
@Controller
public class VIPHandler {

    @Autowired
    VIPFunction vipFunction;

    @RequestMapping(method = RequestMethod.GET,path = "/vip/qry.do")
    public String qryView()throws Exception{
        return "vip/qry";
    }

    @RequestMapping(method = RequestMethod.POST,path = "/vip/qry.do")
    public String qry(String vcode, Map model)throws Exception{
        try {
          VIP v=vipFunction.queryVip(vcode);
          model.put("v",v);
        }catch (ThisSystemException e){
            model.put("mess",e.getMessage());
        }
        return "vip/qry";
    }

    @RequestMapping(path = "/vip/usermain.do")
    public String usermain(){
        return "vip/usermain";
    }
}
