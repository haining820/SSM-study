package com.haining820.controller;

import com.haining820.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.err.println("a1:" + name);
        if ("haiyang".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("王冰冰", 16, "女"));
        userList.add(new User("迪丽热巴", 17, "女"));
        userList.add(new User("古力娜扎", 18, "女"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if (name != null) {
            //admin这些数据应该在数据库中查
            if ("admin".equals(name)) {
                msg = "OK";
            } else {
                msg = "用户名有误!";
            }
        }
        if (pwd != null) {
            //admin这些数据应该在数据库中查
            if ("123456".equals(pwd)) {
                msg = "OK";
            } else {
                msg = "密码有误!";
            }
        }
        return msg;
    }

}
