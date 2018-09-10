package com.bijo.learning.langpackage.designpattern;

public class Lab539 {
    public static void main(String[] args) {
        Hello539 h =Hello539.getHello539();
        System.out.println(h);
        System.out.println(Hello539.getHello539());
        System.out.println(Hello539.getHello539());
    }
}

class Hello539{
    private static Hello539 INS=null;
    private Hello539(){}
    public static Hello539 getHello539(){
        if (INS==null)
            INS=new Hello539();
        return INS;
    }
}
