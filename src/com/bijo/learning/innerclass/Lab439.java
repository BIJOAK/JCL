package com.bijo.learning.innerclass;

public class Lab439 {
    public static void main(String[] args) {
        Person439 p= new Student439();
        p.sleeping();
    }
}
abstract class Person439{
    public abstract void sleeping();
}
class Student439 extends Person439{
    public void sleeping(){
        System.out.println("Student ->sleeping");
    }
}