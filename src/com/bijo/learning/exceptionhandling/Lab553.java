package com.bijo.learning.exceptionhandling;

public class Lab553 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            String data=args[0];
            int x=Integer.parseInt(data);

            int res=10/x;
            System.out.println("Result : "+res);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println("Provide one non zero int value");
        }
        System.out.println("main completed");
    }
}
