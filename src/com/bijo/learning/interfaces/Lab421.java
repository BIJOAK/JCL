package com.bijo.learning.interfaces;

public class Lab421 {
    public static void main(String[] args) {
        B421 ref=new B421();
        ref.show();
    }
}
interface Inter421{
    void show();
}
class A421{
    public void show(){
        System.out.println("A-->show()");
    }
}
class B421 extends A421 implements Inter421{}