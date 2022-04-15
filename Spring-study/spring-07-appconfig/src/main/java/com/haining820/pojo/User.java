package com.haining820.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//“getUser”拿到是因为@bean已经注册了,把component注解去掉一样可以拿到
//@Component //意思是这个类被Spring接管了,注册到了容器中
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("yuhaiyang666")  //属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
