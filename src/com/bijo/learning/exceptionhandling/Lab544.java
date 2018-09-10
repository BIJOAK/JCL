package com.bijo.learning.exceptionhandling;

public class Lab544 {
    public static void main(String[] args) {
        System.out.println("Main started");
        String data=args[0];
        int x=Integer.parseInt(data);
        int res=10/x;
        System.out.println("Result : "+res);
        System.out.println("Main end");

    }
}
