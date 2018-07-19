package com.bijo.learning.inheritance;

public class Lab342 {
    public static void main(String[] args) {
    Hello342 h=new Hello342();
        h.show();
}
}
class Hai342{
    static int a=10;
}

class Hello342 extends Hai342{
    static int a=20;
    void show(){
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
