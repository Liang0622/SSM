package com.vic.service.impl;

import com.vic.bean.User;
import com.vic.dao.UserMapper;
import com.vic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    public boolean login(User user) {
        System.out.println("进入了Service的login方法");
        User savedUser=mapper.select(user);
        if(savedUser==null){
            System.out.println("用户名不存在！");
            return false;
        }else if(savedUser.getPassword().equals(user.getPassword())){
            return true;
        }
        System.out.println("密码输入错误！");
        return false;
    }

    public boolean register(User user) {
        System.out.println("进入了Service的register方法");
        if(mapper.add(user)>0){
            return true;
        }
        return false;
    }
}
