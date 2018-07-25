package com.bijo.learning.abstractclassandmethod;

public class Lab406 {
    public static void main(String[] args) {
        Person406 pob= new CurrentStudent406();
        pob.sleeping();
    }
}
abstract class Person406{
    abstract void sleeping();
}
abstract class Student406 extends Person406{
    void sleeping(){
        System.out.println("Student-->sleeping()");
    }
}
class CurrentStudent406 extends Student406{

}