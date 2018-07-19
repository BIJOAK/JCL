package com.bijo.learning.methodoverriding;

public class Lab376 {
    public static void main(String[] args) {
        B376 bobj=new B376();
        bobj.show();

    }
}

class A376{
    long show(){
        System.out.println("A-->show(int)");
        return 0;
    }
}
class B376 extends A376{
    int show(String ab){
        System.out.println("B-->show(String)");
        return 0;
    }
}
