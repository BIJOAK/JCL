package com.bijo.learning.inheritance;

public class Lab324n325 {
    public static void main(String[] args) {
        Hai324 hai=new Hai324();
        System.out.println(hai.a);
//        System.out.println(hai.b);

        Hello324 hello=new Hello324();
        System.out.println(hello.a);
        System.out.println(hello.b);
    }
}
class Hai324{
    int a=99;
}
class Hello324 extends Hai324{
    int b=88;
}
