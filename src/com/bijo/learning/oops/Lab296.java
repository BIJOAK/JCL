package com.bijo.learning.oops;

public class Lab296 {
    public static void main(String[] args) {
        Hello296 h=new Hello296();
        int a=h.add(10,20);
        System.out.println(a);
        h.add(10,20);
    }
}
class Hello296{
    int add(int a,int b){
        System.out.println("add(int,int)");
        return a+b;
    }
//    void add(int a,int b){
//        System.out.println("add(int,int)");
//    }
}
