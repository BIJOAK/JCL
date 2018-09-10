package com.bijo.learning.exceptionhandling;

public class Lab545 {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            String data = args[0];
            int x = Integer.parseInt(data);
            int res = 10 / x;
            System.out.println("result : " + res);
        }catch (Exception e){
            System.out.println("Enter correct value");
        }
        System.out.println("main ended");
    }
}
