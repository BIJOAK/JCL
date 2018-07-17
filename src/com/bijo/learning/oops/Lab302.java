package com.bijo.learning.oops;

public class Lab302 {
    public static void main(String[] args) {


        Hello302 h = new Hello302();
        byte b = 20;
        h.add(b,10);
        h.add(10,b);
    }

}
class Hello302{
    void add(byte a,int b){
        System.out.println("add(byte,int)");
    }

    void add(int a,byte b){
        System.out.println("add(int,byte)");
    }
}

