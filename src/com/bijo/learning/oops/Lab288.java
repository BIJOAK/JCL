package com.bijo.learning.oops;

public class Lab288 {
    public static void main(String[] args) {
        Hello288 h=new Hello288();
        System.out.println(h.show(10));
    }
}
class Hello288{
    int show(int a){
        System.out.println("show()");
        return 'A';
//        return 0;
    }
}
