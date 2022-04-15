package com.haining820.dao;

import com.haining820.pojo.User;

//操作数据库
public interface UserMapper {
    User getUserById(int id);
}
