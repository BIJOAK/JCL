package com.bijo.learning.langpackage.autoboxing;

public class Lab526 {
    public static void main(String[] args) {
        JlcService526 serv=new JlcService526();
        byte b1=12;
        byte b2=23;
        serv.show(b1,b2);
    }
}

class JlcService526{
//    void show(int ab,int bc){
//        System.out.println("\n--show(int,int)");
//    }
//    void show(byte ab,byte bc){
//        System.out.println("\n--show(byte,byte)");
//    }
    void show(Byte ab,Byte bc){
        System.out.println("\n--show(Byte,Byte)");
    }
    void show(byte...ab){
        System.out.println("\n---show(byte...)");
    }
}
