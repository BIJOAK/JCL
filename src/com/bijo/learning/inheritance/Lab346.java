package com.bijo.learning.inheritance;

public class Lab346 {
    public static void main(String[] args) {
        new B346(10);
    }
}
class A346{
    A346(){
        System.out.println("A->D.C");
    }
}
class B346 extends A346{
    B346(){
        System.out.println("B->D.C");
    }
    B346(int a){
        this();
        System.out.println("B-(int) Cons");
    }
}