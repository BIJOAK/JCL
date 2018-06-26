package com.bijo.learning.lab;

public class Lab70 {
    public static void main(String as[]){
        byte b1=12;
        byte b2=23;
        int a = b1+b2;
//        byte b3=b1+b2;   error incompatible type
        final int c=123;
        byte b4=c;
        int d=123;
//        byte b5=d;    error incompatible type

        final byte b5=90;
        final byte b6=9;
        byte b7=b5+b6;

        final long l1=12;
//        byte b8=l1;



        System.out.println(b1);
        System.out.println(b2);
        System.out.println(a);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b4);
        System.out.println(d);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(20/3);
        System.out.println(20/3.0f);
        System.out.println(20/3.0);
    }
}
