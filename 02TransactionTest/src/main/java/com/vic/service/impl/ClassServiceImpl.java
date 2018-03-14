package com.vic.service.impl;

import com.vic.bean.Student;
import com.vic.bean.Teacher;
import com.vic.dao.StudentMapper;
import com.vic.dao.TeacherMapper;
import com.vic.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClassServiceImpl implements ClassService {
    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private StudentMapper studentMapper;
    public boolean createClass(Teacher teacher, Student student) {
        System.out.println("进入了service的createClass方法");
        if(teacherMapper.addTeacher(teacher)>0&&studentMapper.addStudent(student)>0){
            return true;
        }
        return false;
    }
}
