package com.bijo.learning.oops;

public class Lab298 {
    public static void main(String[] args) {
        Hello298 h=new Hello298();
        int a=h.add(10,20);
        System.out.println(a);
        String b=h.add("Bijo",99);
        System.out.println(b);
    }
}
class Hello298{
    int add(int a,int b){
        System.out.println("add(int,int)");
        return a+b;
    }
    String add(String str,int a){
        System.out.println("add(String,int)");
        return str+a;
    }
}
