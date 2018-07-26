package com.bijo.learning.multipleinheritance;

public class Lab423 {
    public static void main(String[] args) {
        D dobj= new D();
        A aobj=dobj;
        B bobj=(B)aobj;
        D dobj1=(D)aobj;
        System.out.println("Hello Guys");
    }
}
