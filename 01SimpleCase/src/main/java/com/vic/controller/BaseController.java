package com.vic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/baseController")
    public String redirect(String param) {
        if(param.equals("login")){
            return "redirect:/login.jsp";
        }else if(param.equals("register")){
            return "redirect:/register.jsp";
        }
        return "redirect:/help.jsp";
    }
}
