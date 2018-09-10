package com.bijo.learning.langpackage.designpattern;

public class Lab538 {
    public static void main(String[] args) {
        Hello538 h =Hello538.getHello538();
        System.out.println(h);
        System.out.println(Hello538.getHello538());
        System.out.println(Hello538.getHello538());
    }
}

class Hello538{
    private static Hello538 INS=null;
    static {
        INS=new Hello538();
    }
    private Hello538(){}
    public static Hello538 getHello538(){
        return INS;
    }
}