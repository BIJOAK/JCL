package com.bijo.learning.abstractclassandmethod;

import com.bijo.learning.p1.Hello;

public class Lab407 {
    public static void main(String[] args) {
        System.out.println(Hello407.A);
        Hello407.show();
    }
}
abstract class Hello407{
    static int A=1234;
    static void show(){
        System.out.println("Hello-->show()");
    }
}