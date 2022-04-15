import com.haining820.pojo.Student;
import com.haining820.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        //在后边显示声明类型就不用强转了
        User user = context.getBean("user2", User.class);
        User userB = context.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(userB.hashCode());
        // System.out.println(user);

    }
}
