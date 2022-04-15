package com.haining820.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("t3")
    public String Test(ModelMap map){
        map.addAttribute("msg","ModelMapTest");
        return "test";
    }

}
