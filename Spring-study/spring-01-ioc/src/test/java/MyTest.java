import com.haining820.dao.UserDao;
import com.haining820.dao.UserDaoImpl;
import com.haining820.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        UserServiceImpl service = new UserServiceImpl();
//        service.setUserDao(new UserDaoImpl());
//        service.getUser();
//        service.setUserDao(new MysqlUserDaoImpl());
//        service.getUser();
//        service.setUserDao(new OracleUserDaoImpl());
//        service.getUser();
        // 获取Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 容器在手，天下我有！需要什么就直接get！
        UserService service = (UserService) context.getBean("userServiceImpl");
        UserService service2 = (UserService) context.getBean("userServiceImpl");
        System.out.println(service == service2);    // true
        service.getUser();

    }

}
