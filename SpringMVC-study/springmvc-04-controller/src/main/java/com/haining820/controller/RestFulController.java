package com.haining820.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

//  原来的: http://localhost:8080/add?a=1&b=2
//  RestFul: http://localhost:8080/add/a/b
//  http://localhost:8080/add/1/2

//    @RequestMapping("/add")
//    public String test(int a, String b, Model model) {
//        String res = a + b;
//        model.addAttribute("msg", "结果为" + res);
//        return "test";
//    }

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)  //什么都不加,默认是GET方式
//    @GetMapping("/add/{a}/{b}")  //只能通过GET方式提交
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "GetMapping结果为" + res);
        return "test";
    }



//
//    @PostMapping("/add/{a}/{b}")
//    public String test3(@PathVariable int a, @PathVariable String b, Model model) {
//        String res = a + b;
//        model.addAttribute("msg", "PostMapping结果为" + res);
//        return "test";
//    }
}
