package com.bijo.learning.langpackage.designpattern;

public class Lab537 {
    public static void main(String[] args) {
        Hello537  h=Hello537.getHello();
        System.out.println(h);
        System.out.println(Hello537.getHello());
        System.out.println(Hello537.getHello());
        //h.clone();
    }

}

class Hello537{

    private static Hello537 INS=new Hello537();

    private Hello537(){}

    public static Hello537 getHello(){
        return INS;
    }
}