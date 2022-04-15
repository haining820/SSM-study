package com.haining820.demo3;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色,现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用处理角色来处理要调用的接口对象,代理类实现接口!
        pih.setRent(host);
        //这里的proxy就是动态生成的,我们并没有写
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
