package com.bijo.learning.langpackage.designpattern;

import com.bijo.learning.p1.Hello;

public class Lab540 {
    public static void main(String[] args) {
        Hello540 h =Hello540.getHello540();
        System.out.println(h);
        System.out.println(Hello540.getHello540());
        System.out.println(Hello540.getHello540());
        Hello540 h2= (Hello540) h.clone();
        System.out.println(h2);
    }
}

class Hello540{
    private static Hello540 INS=new Hello540();
    private Hello540(){}
    public static Hello540 getHello540(){
        return INS;
    }

    protected Object clone(){
        return this;
    }
}