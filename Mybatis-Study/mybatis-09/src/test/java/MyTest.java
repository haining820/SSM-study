
import com.haining820.dao.UserMapper;
import com.haining820.pojo.User;
import com.haining820.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;


public class MyTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

//        User newUser = new User(2, "yuhaiyang", "123456");
//        mapper.updateUser(newUser);
//
//        System.out.println("==========================================");
//        User user2 = mapper.queryUserById(1);
//        System.out.println(user2);

        sqlSession.close();

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        sqlSession2.close();
//
//
//        User user3 = mapper2.queryUserById(2);
//        System.out.println(user3);
//
//
//        User user4 = mapper2.queryUserById(2);
//        System.out.println(user4);
//        System.out.println("=====================================");

//        User newUser = new User(2, "yuhaiyang", "55555555");
//        mapper.updateUser(newUser);


        //一级缓存默认开启,手动清理缓存
//        sqlSession.clearCache();
//
//        User user2 = mapper.queryUserById(1);
//        System.out.println(user2);
//
//        System.out.println(user==user2);



    }
}
