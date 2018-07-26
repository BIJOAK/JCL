package com.bijo.learning.innerclass;

public class Lab442 {
    public static void main(String[] args) {
        Person442 stu=new Person442() {
            public void sleeping() {
                System.out.println("Student-->sleeping");
            }
        };
        stu.sleeping();
    }
}
abstract class Person442{
    public abstract void sleeping();
}
