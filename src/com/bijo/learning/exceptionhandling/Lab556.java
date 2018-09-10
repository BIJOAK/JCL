package com.bijo.learning.exceptionhandling;

public class Lab556 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            int res=10/3;
            System.out.println("Result : "+res);
            return;
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
            System.out.println("Main completed");

    }
}
