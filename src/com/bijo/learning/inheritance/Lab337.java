package com.bijo.learning.inheritance;

public class Lab337 {
    public static void main(String[] args) {
        Hello337 helo=new Hello337();
    }
}

class Hai337{

    {
        System.out.println("Hai-->I.B: ");
    }
    static {
        System.out.println("Hai-->S.B: ");
    }
}

class Hello337 extends Hai337{

    {
        System.out.println("Hello-->I.B:");
    }
    static {
        System.out.println("Hello-->S.B:");
    }
}