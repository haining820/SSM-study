package com.haining820.mapper;

import com.haining820.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
//没有实现类就无法注入一个bean
public class UserMapperImpl implements UserMapper {

    //原来,我们所有的操作都是用SqlSession来执行,现在都使用SqlSessionTemplate

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();
        return userList;
    }
}
