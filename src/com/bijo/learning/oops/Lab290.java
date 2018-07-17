package com.bijo.learning.oops;

public class Lab290 {

    public static void main(String[] args) {
        Hello290 h=new Hello290();
        System.out.println(h.show(10));
    }
}
class Hello290{
    boolean show(int a){
        System.out.println("show()");
        return true;
    }
}