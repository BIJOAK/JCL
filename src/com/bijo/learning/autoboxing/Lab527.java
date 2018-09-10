package com.bijo.learning.autoboxing;

public class Lab527 {
    public static void main(String[] args) {
        JlcService527 serv=new JlcService527();
        byte b1=12;
        byte b2=23;
        serv.show(b1,b2);
    }
}

class JlcService527{
//    void show(int ab,int bc){
//        System.out.println("\n--show(int,int)");
//    }
//    void show(byte ab,byte bc){
//        System.out.println("\n--show(byte,byte)");
//    }
//    void show(Byte ab,Byte bc){
//        System.out.println("\n--show(Byte,Byte)");
//    }
    void show(byte...ab){
        System.out.println("\n---show(byte...)");
    }
}
