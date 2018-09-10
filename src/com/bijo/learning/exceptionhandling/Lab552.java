package com.bijo.learning.exceptionhandling;

public class Lab552 {
    public static void main(String[] args) {
        System.out.println("Main started");
        String data=null;

        try {
            data=args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide one value");
        }

        int x=0;

        try {
            x=Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("Porvide int value");
        }

        try {
            int res=10/x;
            System.out.println("Result "+ res);
        } catch (ArithmeticException e) {
            System.out.println("Provide non zero number");
        }
        System.out.println("main completed");

    }
}
