package com.bijo.learning.exceptionhandling;

public class Lab572 {
    public static void main(String[] args) {
        Student572 stu[]=new Student572[700];

        try {
            for (int i = 0; i < stu.length ; i++) {
                stu[i]=new Student572();
                System.out.println((i+1) + "Object created");
            }
        } catch (Error e) {
            System.out.println("\n**Error Occured**: "+e);
        }
        System.out.println("\nAfter Handling");
        Student572 st=new Student572();
    }
}
class Student572 {
    long arr[] = new long[215833];
}