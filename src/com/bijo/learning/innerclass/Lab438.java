package com.bijo.learning.innerclass;

public class Lab438 {
    public static void main(String[] args) {
        Outer438 out=new Outer438();
        out.show();
    }
}
class Outer438{
    int a=10;
    static int b=20;
    void show(){
        System.out.println("Outer-->show() Begin");
        class Inner438{
            void m1(){
                System.out.println("Inner-->m1()");
                System.out.println(a);
                System.out.println(b);
            }
        }
        new Inner438().m1();
        System.out.println("Outer-->show() End");
    }
}