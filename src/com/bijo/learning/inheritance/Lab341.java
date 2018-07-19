package com.bijo.learning.inheritance;

public class Lab341 {
    public static void main(String[] args) {
        Hello341 h=new Hello341();
        h.show();
    }
}
class Hai341{
    int a=10;
}

class Hello341 extends Hai341{
    int a=20;
    void show(){
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}