package com.bijo.learning.oops;

public class Lab268 {
    public static void main(String as[]){
        Hello268 h=new Hello268();
        h.show();
    }
}

class Hello268{
    int a=10;
    static int b=20;

    void show(){
        String a ="Bijo";
        String b="AK";
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(Hello268.b);
    }
}
