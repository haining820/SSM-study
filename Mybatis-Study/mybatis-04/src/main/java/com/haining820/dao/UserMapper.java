package com.haining820.dao;

import com.haining820.pojo.User;

import java.util.List;
import java.util.Map;

//操作数据库
public interface UserMapper {
    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Integer> map);

    //分页2
    List<User> getUserByRowBounds();
}
