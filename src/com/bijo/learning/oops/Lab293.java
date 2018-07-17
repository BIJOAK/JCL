package com.bijo.learning.oops;

public class Lab293 {
    public static void main(String[] args) {
        Hello293 h=new Hello293();
//        System.out.println(h.show());
//        System.out.println(h.show(10,20));
        System.out.println(h.show(10));
    }
}
class Hello293{
    int show(int a){
        System.out.println("show()");
        return a+1;
    }
}