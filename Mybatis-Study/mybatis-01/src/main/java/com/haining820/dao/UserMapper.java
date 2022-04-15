package com.haining820.dao;

import com.haining820.pojo.User;

import java.util.List;
import java.util.Map;

//操作数据库
public interface UserMapper {

    //模糊查询
    List<User> getUserLike(String value);

    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //insert一个用户
    int addUser(User user);

    //通过map添加用户
    int addUserByMap(Map<String,Object> map);

    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
