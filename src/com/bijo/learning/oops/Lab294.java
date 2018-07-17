package com.bijo.learning.oops;

public class Lab294 {
    public static void main(String[] args) {
        Hello294 h=new Hello294();
//        h.show(12);
        byte b=12;
        h.show(b);
        h.show((byte)12);
    }
}
class Hello294{
    void show(byte x){
        System.out.println("show(byte)");
    }
}
