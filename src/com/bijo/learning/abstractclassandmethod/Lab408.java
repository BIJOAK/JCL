package com.bijo.learning.abstractclassandmethod;

public class Lab408 {
    public static void main(String[] args) {
        Hai408 hai=new Hai408(10);
        hai.show();
    }
}
abstract class Hello408{
    int a;
    Hello408(int a){
        this.a=a;
        System.out.println("Hello(int) cons");
    }
    {
        System.out.println("Hello I.B");
    }
    void show(){
        System.out.println("Hello-->show()");
    }
}
class Hai408 extends Hello408{
    Hai408(int a){
        super(a);
    }
}