package com.bijo.learning.oops;

public class Lab300 {
    public static void main(String[] args) {


        Hello300 h = new Hello300();
        byte b = 20;
        h.add(10,b);
        h.add(b,b);
    }
}
class Hello300{
    void add(int a,byte b){
        System.out.println("add(int,byte)");
    }
}