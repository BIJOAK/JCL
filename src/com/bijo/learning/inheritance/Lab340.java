package com.bijo.learning.inheritance;

public class Lab340 {
    public static void main(String[] args) {
        new C340();
    }
}

class A340{
    A340(){
        System.out.println("A-->D.C");
    }
    static {
        System.out.println("A-->S.B");
    }
    {
        System.out.println("A-->I.B");
    }
}
class B340 extends A340{
    B340(){
        System.out.println("B-->D.C");
    }
    static {
        System.out.println("B-->S.B");
    }
    {
        System.out.println("B-->I.B");
    }
}
class C340 extends B340{
    C340(){
        System.out.println("C-->D.C");
    }
    static {
        System.out.println("C-->S.B");
    }
    {
        System.out.println("C-->I.B");
    }
}