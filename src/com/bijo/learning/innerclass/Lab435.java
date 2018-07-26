package com.bijo.learning.innerclass;

public class Lab435 {
    public static void main(String[] args) {
        new Outer435().new Inner435().show();

    }
}
class Outer435{
    int a=11;
    class Inner435{
        int a=22;
        void show(){
            System.out.println("Inner-->show()");
            int a=33;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Inner435.this.a);
//            System.out.println(super.a);
            System.out.println(Outer435.this.a);
        }
    }
}
