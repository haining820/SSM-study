package com.haining820.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类,代理调用处理
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }


    //生成得到代理类
    /*
    return Proxy.newProxyInstance,获得新的代理类
    this.getClass().getClassLoader(),类加载到哪个位置
    rent.getClass().getInterfaces(),要代理的接口是哪一个接口
    this,代表调用自己,因为实现的是InvocationHandler接口
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的本质就是通过反射机制实现
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    //中介看房
    public void seeHouse(){
        System.out.println("中介带你看房子!");
    }

    //中介收中介费
    public void fare(){
        System.out.println("中介收中介费!");
    }
}
