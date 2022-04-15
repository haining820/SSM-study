package com.haining820.demo2;

//租客
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();

        //代理帮房东租房，代理还会有一些附属操作
        Proxy proxy = new Proxy(host);

        //租房直接找中介
        proxy.rent();
    }
}