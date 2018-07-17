package com.bijo.learning.oops;

public class Lab276n277n278 {
    public static void main(String as []){

        Hello276 h1 = new Hello276();
        h1.show();

        Hello277 h2 =new Hello277();
        h2.show();
    }
}

class Hello276{
    int a;
    static int b;
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}

class Hello277{
    int a;
    static int b;
    static void show(){
//        System.out.println(a);
        System.out.println(b);
    }
}