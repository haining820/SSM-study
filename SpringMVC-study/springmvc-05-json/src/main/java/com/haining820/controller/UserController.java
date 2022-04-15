package com.haining820.controller;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.haining820.Utils.JsonUtils;
import com.haining820.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController  //用了这个注解,下面所有的方法只会返回字符串
public class UserController {

    //    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
//    @ResponseBody  //加上这个注解后,不会走视图解析器,会直接返回一个字符串,配合Controller使用
    public String json1() throws JsonProcessingException {

        //json  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("于海洋", 6, "男");
        String str = mapper.writeValueAsString(user);
        return str;
    }


    @RequestMapping("/j11")
    public String json11() throws JsonProcessingException {
        User user = new User("于海洋", 16, "男");
        return JsonUtils.getJson(user);
    }


    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();
        User user1 = new User("于海洋1", 6, "男");
        User user2 = new User("于海洋2", 6, "男");
        User user3 = new User("于海洋3", 6, "男");
        User user4 = new User("于海洋4", 6, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

//        String str = mapper.writeValueAsString(userList);
//        return str;
        return JsonUtils.getJson(userList);
    }


    @RequestMapping("/j8")
    public String json8() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Date date = new Date();
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //ObjectMapper,时间解析后的默认格式为:Timestamp.时间戳:1970年1月1日到现在的毫秒数
        return mapper.writeValueAsString(sdf.format(date));
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(sdf);

        Date date = new Date();
        //ObjectMapper,时间解析后的默认格式为:Timestamp.时间戳:1970年1月1日到现在的毫秒数
//        String str = mapper.writeValueAsString(date);
        return mapper.writeValueAsString(sdf.format(date));
    }


    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        Date date = new Date();
//        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j5")
    public String json5() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("于海洋1", 6, "男");
        User user2 = new User("于海洋2", 6, "男");
        User user3 = new User("于海洋3", 6, "男");
        User user4 = new User("于海洋4", 6, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return JSON.toJSONString(userList);
    }





}


