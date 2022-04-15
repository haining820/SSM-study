package com.haining820.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
// @RestController
@RequestMapping("hello")  	// 映射请求路径
public class HelloController {
    @RequestMapping("/h1")	// 访问地址：localhost8080/hello/h1
    public String hello(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");	 // 封装数据
        return "hello";  	    // 返回视图，会被视图解析器处理：WEB-INF/jsp/hello.jsp
    }
}