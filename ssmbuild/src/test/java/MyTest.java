import com.haining820.pojo.Book;
import com.haining820.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);
        for (Book book : bookService.queryAllBook()) {
            System.out.println(book);
        }
    }

}
