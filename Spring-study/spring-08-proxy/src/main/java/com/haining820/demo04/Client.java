package com.haining820.demo04;


import com.haining820.demo.UserService;
import com.haining820.demo.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        //代理角色,不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userServiceImpl);
        //动态生成代理类,getProxy返回的必须是接口
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
        /**
         * [debug]执行add方法
         * add
         * [debug]执行delete方法
         * delete
         * [debug]执行update方法
         * update
         * [debug]执行query方法
         * query
         */
    }
}
