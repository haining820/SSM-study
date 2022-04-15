package com.haining820.dao;

import com.haining820.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//操作数据库
public interface UserMapper {


    //根据id查询用户
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
