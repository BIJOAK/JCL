package com.bijo.learning.abstractclassandmethod;

public class Lab399 {
    public static void main(String[] args) {
        Shape399 sp=new Square399();
        sp.area();
    }

}
class Shape399{
    void area(){}
}

class Square399 extends Shape399{

}