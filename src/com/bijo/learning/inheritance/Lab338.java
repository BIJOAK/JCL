package com.bijo.learning.inheritance;

public class Lab338 {
    public static void main(String[] args) {
        new B338();
    }
}
class A338{
    A338(){
        System.out.println("A-->D.C");
    }
}

class B338 extends A338{
    B338(){
        System.out.println("B-->D.C");
    }
}
