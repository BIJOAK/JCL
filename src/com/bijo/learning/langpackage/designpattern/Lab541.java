package com.bijo.learning.langpackage.designpattern;

//N-ton design pattern
public class Lab541 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Hello541.getHello541());
        }
    }
}

class Hello541{
    private static Hello541 h1=new Hello541();
    private static Hello541 h2=new Hello541();

    private Hello541(){}

    public static Hello541 getHello541(){
        if(Math.random()>0.5){
            return h1;
        }else {
            return h2;
        }
    }
}