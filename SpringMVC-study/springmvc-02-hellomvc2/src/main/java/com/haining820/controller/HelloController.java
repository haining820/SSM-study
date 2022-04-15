package com.haining820.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String res = "HelloSpringMVC!666";
        mv.addObject("msg",res);//键值对

        //视图跳转
        mv.setViewName("test");//要跳转到test.jsp

        return mv;
    }
}
