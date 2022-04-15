package com.haining820.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class EncodingController {

//    @RequestMapping(value = "/e/t1",method = RequestMethod.POST)
    @PostMapping("/e/t1")
    public String test1(String name, Model model, HttpServletRequest req){
//        req.setCharacterEncoding("utf-8");
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

}
