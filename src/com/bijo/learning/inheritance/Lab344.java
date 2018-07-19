package com.bijo.learning.inheritance;

public class Lab344 {
    public static void main(String[] args) {
        new B344();
    }
}
class A344{
    A344(int a){
        System.out.println("A(int) Cons");
    }
}
class B344 extends A344{
    B344(){
//        super();
        super(10);
        System.out.println("B->D.C");
    }
}
