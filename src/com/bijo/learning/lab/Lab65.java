package com.bijo.learning.lab;

public class Lab65 {
    public static void main(String as[]){
        int a =19;
        int b =+a;
        int c =-a;
        byte d = 19;
//        byte e = +d;  error incompatible type
//        byte f = -d;
        char ch1='A';
//        char ch2= +ch1; error incompatible type

        int g = +ch1;
        double d1=1234.567;
        double d2 = -d1;
        double d3=+d1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(ch1);
        System.out.println(g);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }

}
