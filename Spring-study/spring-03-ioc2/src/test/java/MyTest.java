import com.haining820.pojo.User;
import com.haining820.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 在配置文件中对象就已经被实例化了,通过getBean拿到这个对象以便调用这个类的其他方法
        //Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        User user = (User) context.getBean("userAlias");
//        User user2 = (User) context.getBean("user");
//        System.out.println(user==user2);
//        UserT u2 = (UserT) context.getBean("u4");
//
//        u2.show();
//        user.show();
    }
}
