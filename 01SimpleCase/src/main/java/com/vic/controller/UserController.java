package com.vic.controller;

import com.vic.bean.User;
import com.vic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/register")
    public String register(User user){
        System.out.println("进入UserController的register方法");
        if(service.register(user)){
            System.out.println("用户注册成功！");
            return "success";
        }
        System.out.println("用户注册失败！");
        return "error";
    }
    @RequestMapping("/login")
    public String login(User user){
        System.out.println("进入UserController的login方法");
        if(service.login(user)){
            System.out.println("用户登录成功！");
            return "success";
        }
        System.out.println("用户登录失败！");
        return "error";
    }
}
