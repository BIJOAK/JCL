package com.bijo.learning.inheritance;

public class Lab339 {
    public static void main(String[] args) {
        new C339();
    }
}
class A339{
    A339(){
        System.out.println("A-->D.C");
    }
}

class B339 extends A339{
    B339(){
        System.out.println("B-->D.C");
    }
}

class C339 extends B339{
    C339(){
        System.out.println("C-->D.C");
    }
}