package com.haining820.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ModelTest1 {
    @GetMapping("/m1/t1")
    public String test(HttpServletRequest request, HttpServletResponse response){
        String id = request.getSession().getId();
        System.out.println(id);
        return "test";
    }


    @GetMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg","ModelTest1");
//        return "/WEB-INF/jsp/test.jsp";  //转发
//        return "forward:/WEB-INF/jsp/test.jsp";  //转发
        return "redirect:/index.jsp";  //重定向
    }


}


