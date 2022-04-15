import com.haining820.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意:动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.delete();
    }
}
/**
 * 查询了一个用户
 * 执行了select方法,返回结果为:null
 */

/**
 * ==============方法执行前===============
 * 查询了一个用户
 * ==============方法执行后===============
 */
