package com.bijo.learning.inheritance;

public class Lab335 {
    public static void main(String[] args) {
        new Hello335();
    }
}

class Hai335{
    static int a=99;
    static {
        System.out.println("Hai-->S.B: "+a);
    }
}

class Hello335 extends Hai335{
    static int b=88;
    static {
        System.out.println("Hello-->S.B:"+a);
        System.out.println("Hello-->S.B:"+b);
    }
}
