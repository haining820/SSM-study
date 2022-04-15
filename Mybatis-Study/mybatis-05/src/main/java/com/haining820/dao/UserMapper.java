package com.haining820.dao;

import com.haining820.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//操作数据库
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into mybatis.user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update mybatis.user set name=#{name}, pwd=#{pwd} where id=#{id}")
    int updateUser(User user);


    @Delete("delete from mybatis.user where id=#{uid}")
    int deleteUser(@Param("uid") int id);
}