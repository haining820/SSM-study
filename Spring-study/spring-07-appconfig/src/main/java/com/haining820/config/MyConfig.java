package com.haining820.config;

import com.haining820.pojo.User;
import org.springframework.context.annotation.*;

//@Configuration代表这是一个配置类,相当于之前的beans.xml配置文件
//这个也会被Spring托管,注册到容器中,因为它本质上也是@Component
@Configuration
//@ComponentScan("com.haining820.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean,就相当于之前写的一个bean标签
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值就相当于bean标签中的class属性
//     @Bean
    @Bean("hyyu666")
    public User getUser() {
        return new User();  //就是返回要注入到bean中的对象!
    }

}
