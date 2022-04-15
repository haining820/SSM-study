
import com.haining820.dao.UserMapper;
import com.haining820.pojo.User;
import com.haining820.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }

//        mapper.getUserById(7);
//        mapper.addUser(new User(8, "古力娜扎", "123456"));
//        mapper.updateUser(new User(4, "王二麻子", "123456"));
        mapper.deleteUser(5);
//        sqlSession.commit();
        sqlSession.close();
    }
}
