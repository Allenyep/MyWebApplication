package com.allen.vipmana.web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by allen on 2017/6/12.
 */
@Controller
public class CommonHandler {
    @RequestMapping("/error.do")
    public String error(){
        return "error";
    }

    @RequestMapping("/notfound.do")
    public String notfound(){
        return "notfound";
    }
}
