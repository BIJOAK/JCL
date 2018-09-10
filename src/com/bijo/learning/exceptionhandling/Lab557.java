package com.bijo.learning.exceptionhandling;

public class Lab557 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            int res=10/3;
            System.out.println("Result : "+res);
            return;
        } catch (Exception e) {
            System.out.println("Invalid input");
        }finally {
            System.out.println("Main completed");
        }


    }
}
