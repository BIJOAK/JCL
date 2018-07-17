package com.bijo.learning.oops;

public class Lab304 {
    public static void main(String[] args) {
        Hello304 h =new Hello304();
        h.show(null);
        h.show("BIJO");
        h.show(h);
    }


}
class Hello304{
    void show(String str){
        System.out.println("show(String)");
    }
    void  show(Object obj){
        System.out.println("show(Object)");
    }
}
