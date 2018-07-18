package com.bijo.learning.inheritance;

public class Lab336 {
    public static void main(String[] args) {
        new Hello336();
    }
}

class Hai336{
    int a=99;
    {
        System.out.println("Hai-->I.B: "+a);
    }
}

class Hello336 extends Hai336{
    int b=88;
    {
        System.out.println("Hello-->I.B:"+a);
        System.out.println("Hello-->I.B:"+b);
    }
}
