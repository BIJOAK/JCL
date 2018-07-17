package com.bijo.learning.oops;

public class Lab291 {
    public static void main(String[] args) {
        Hello291 h=new Hello291();
        System.out.println(h.show(10));
    }
}
class Hello291{
    boolean show(int a){
        System.out.println("show()");
        return true;
//        return 0;
    }
}
