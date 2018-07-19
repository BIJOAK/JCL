package com.bijo.learning.methodoverriding;

public class Lab384 {
    public static void main(String[] args) {
        B384 bobj=new B384();
        bobj.m1();
    }
}
class A384{
    void m1(){}
}
class B384 extends A384{
//    private void m1(){}
}
