package com.bijo.learning;

public class Lab5 {
    int a;
    public static void main(String[] as){

//        System.out.println(a); //non static field referencing to static method
        Lab5 lab5 = new Lab5();
        System.out.println(lab5.a);
        System.out.println(lab5);
    }
}
