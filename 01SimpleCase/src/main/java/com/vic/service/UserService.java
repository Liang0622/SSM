package com.vic.service;

import com.vic.bean.User;

public interface UserService {
    boolean register(User user);
    boolean login(User user);
}
