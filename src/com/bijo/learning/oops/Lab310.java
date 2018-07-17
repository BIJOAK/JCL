package com.bijo.learning.oops;

public class Lab310 {
    public static void main(String[] args) {
        Hello310 h=new Hello310();
        h.sum(12,23);
    }
}
class Hello310{
    void sum(int a,int b){
        System.out.println("--sum(int,int)");
        System.out.println(a+b);
    }
}
