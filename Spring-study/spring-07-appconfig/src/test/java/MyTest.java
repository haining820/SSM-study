import com.haining820.config.MyConfig;
import com.haining820.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        //如果完全使用了配置类方式去做,就只能通过AnnotationConfig上下文来获取容器,通过配置类的class文件加载!
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
       User getUser = context.getBean("hyyu666", User.class);
       System.out.println(getUser.hashCode());
       System.out.println(getUser.getName());

        // User user = context.getBean("beanName", User.class);
        // System.out.println(user.hashCode());
        // System.out.println(user.getName());
    }
}
