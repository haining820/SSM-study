package com.haining820.demo04;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类,代理调用处理
/*
InvocationHandler 是代理实例的调用处理程序 实现的接口。
每个代理实例都具有一个关联的调用处理程序。对代理实例调用方法时，
将对方法调用进行编码并将其指派到它的调用处理程序的 invoke 方法。
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    //Proxy:提供用于创建动态代理类和实例的静态方法，它还是由这些方法创建的所有动态代理类的超类。
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target,args);
        return invoke;
    }

    public void log(String msg){
        System.out.println("[debug]执行"+msg+"方法");
    }

}
