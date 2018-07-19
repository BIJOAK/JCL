package com.bijo.learning.inheritance;

public class Lab343 {
    public static void main(String[] args) {
        Hello343 h=new Hello343();
        h.show();
    }
}
class Hai343{
    static int a=10;
}

class Hello343 extends Hai343{
    static int a=20;
    static void show(){
        int a=30;
        System.out.println(a);
//        System.out.println(this.a);
//        System.out.println(super.a);
        System.out.println(Hello343.a);
        System.out.println(Hai343.a);
    }
}
