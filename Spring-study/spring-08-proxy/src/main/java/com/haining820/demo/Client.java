package com.haining820.demo;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
//        service.add();
        UserServiceProxy proxy = new UserServiceProxy(service);
        proxy.add();
    }
}
