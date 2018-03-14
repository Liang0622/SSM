package com.vic.dao;

import com.vic.bean.User;

public interface UserMapper {
    int add(User user);
    User select(User user);
}
