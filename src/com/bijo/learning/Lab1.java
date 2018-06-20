package com.bijo.learning;

class Hello1{

    boolean b1;
    byte b2;
    short s;
    int i;
    long b;
    float f;
    double d;
    String str;
    Hello2 h1;

    void show(){

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(str);
        System.out.println(h1);

    }
}

public class Lab1 {

    public static void main(String[] as) {

        Hello1 h = new Hello1();
        h.show();
        System.out.println(h);

    }
}