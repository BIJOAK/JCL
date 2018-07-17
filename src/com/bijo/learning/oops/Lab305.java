package com.bijo.learning.oops;

public class Lab305 {
    public static void main(String[] args) {
        Hello305 h=new Hello305();
        h.show(h);
        h.show("Bijo");
//        h.show(null);
    }
}
class Hello305{
    void show(String str){
        System.out.println("show(String)");
    }
    void show(Hello305 h){
        System.out.println("show(Hello305");
    }
}
