package com.bijo.learning.oops;

public class Lab303 {
    public static void main(String[] args) {


        Hello303 h = new Hello303();
        byte b = 20;
//        h.add(b,b);
    }

}
class Hello303{
    void add(byte a,int b){
        System.out.println("add(byte,int)");
    }

    void add(int a,byte b){
        System.out.println("add(int,byte)");
    }
}
