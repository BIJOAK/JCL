package com.bijo.learning.abstractclassandmethod;

public class Lab405 {
    public static void main(String[] args) {
        Person405 pob=new CurrentStudent405();
        pob.sleeping();
        pob.walking();
    }
}
abstract class Person405{
    abstract void sleeping();
    abstract void walking();
}

abstract class Student405 extends Person405{
    void sleeping(){
        System.out.println("Student-->sleeping()");
    }
}
class CurrentStudent405 extends Student405{
    void walking(){
        System.out.println("Current-->walking()");
    }
}