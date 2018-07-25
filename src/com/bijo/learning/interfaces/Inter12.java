package com.bijo.learning.interfaces;

public interface Inter12 {
    int AB=90;
}
class Hello12{
    String AB="Bijo";
}
class Hai12 extends Hello12 implements Inter12{
    void show(){
        System.out.println(super.AB);
        System.out.println(Inter12.AB);
    }
}