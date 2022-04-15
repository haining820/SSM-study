package com.haining820.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // <bean id="user" class="com.haining820.pojo.User"/>
@Scope("singleton")
public class User {
    @Value("yuhaiyang")     // <property name="name" value="yuhaiyng">
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}