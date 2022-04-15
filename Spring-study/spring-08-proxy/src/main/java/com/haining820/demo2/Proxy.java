package com.haining820.demo2;

public class Proxy implements Rent {
    private Host host;

//    public Proxy(){
//    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        heTong();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //签合同
    public void heTong(){
        System.out.println("签合同");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
