package com.bijo.learning.abstractclassandmethod;

public class Lab404 {
    public static void main(String[] args) {
        Shape404 sp=new Square404();
        sp.area();
    }
}

abstract class Shape404{
    abstract void area();
}
class Square404 extends Shape404{
    void area(){
        System.out.println("Square -->area()");
    }
}