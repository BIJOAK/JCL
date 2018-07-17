package com.bijo.learning.oops;

public class Lab301 {
    public static void main(String[] args) {


        Hello301 h = new Hello301();
        byte b = 20;
        h.add(b,10);
        h.add(b,b);
    }
}
class Hello301{
    void add(byte a,int b){
        System.out.println("add(byte,int)");
    }
}