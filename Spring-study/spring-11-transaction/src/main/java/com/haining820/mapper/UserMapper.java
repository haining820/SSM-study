package com.haining820.mapper;

import com.haining820.pojo.User;

import java.util.List;

public interface UserMapper {

    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(int id);


}
