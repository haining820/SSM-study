package com.haining820.dao;

import com.haining820.pojo.User;
import com.haining820.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {


    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        //select * from mybatis.user where id = #{id}
        //类型处理器
        //select id,name,pwd from mybatis.user where id = #{id}
        sqlSession.close();
    }
}
