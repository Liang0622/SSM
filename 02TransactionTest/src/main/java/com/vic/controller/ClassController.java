package com.vic.controller;

import com.vic.bean.Student;
import com.vic.bean.Teacher;
import com.vic.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ClassController {

    @Autowired
    private ClassService service;

    @RequestMapping("/createClass")
    public String createClass(Teacher teacher, Student student){
        System.out.println("进入了ClassController的createClass方法");
        if(service.createClass(teacher,student)){
            System.out.println("班级创建成功！");
            return "success";
        }
        System.out.println("班级创建失败！");//走不到这里，如果有异常，会被配置的异常处理拦截
        return "error";
    }
}
