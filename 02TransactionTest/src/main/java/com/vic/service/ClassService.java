package com.vic.service;

import com.vic.bean.Student;
import com.vic.bean.Teacher;

public interface ClassService {
    boolean createClass(Teacher teacher, Student student);
}
