package com.bijo.learning.multipleinheritance;

public class Lab427n428 {
    public static void main(String[] args) {
        A aobj=new D();
        System.out.println(aobj instanceof A);
        System.out.println(aobj instanceof B);
        System.out.println(aobj instanceof C);
        System.out.println(aobj instanceof D);
//        System.out.println(aobj instanceof E);
    }
}
