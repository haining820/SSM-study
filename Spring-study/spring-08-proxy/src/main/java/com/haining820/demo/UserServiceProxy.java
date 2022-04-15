package com.haining820.demo;

public class UserServiceProxy implements UserService{

    UserServiceImpl service = new UserServiceImpl();

    public void log(String msg){
        System.out.println("[debug]执行"+msg+"方法");
    }


    public UserServiceProxy(UserServiceImpl service) {
        this.service = service;
    }

    public void add() {
        log("add");
        service.add();
    }

    public void update() {
        log("update");
        service.update();
    }

    public void delete() {
        log("delete");
        service.delete();
    }

    public void query() {
        log("query");
        service.query();
    }

}
