package com.bijo.learning.oops;

public class Lab289 {
    public static void main(String[] args) {
        Hello289 h=new Hello289();
        System.out.println(h.show(10));
    }
}
class Hello289{
    long show(int a){
        System.out.println("show()");
        return a+1;
    }
}
