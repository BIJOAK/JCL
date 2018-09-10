package com.bijo.learning.exceptionhandling;

public class Lab551 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            int res=10/0;
            System.out.println("Result"+res);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");;
        }
//        System.out.println("JLC");
        catch (Exception e){
            System.out.println("Invalid input");
        }
        System.out.println("Main completed");
    }
}
