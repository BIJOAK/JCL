package com.bijo.learning.exceptionhandling;

public class Lab558 {
    public static void main(String[] args) {
        System.out.println("main started");
        int r=new Hello558().show();
        System.out.println("main :"+r);
        System.out.println("main completed");
    }
}

class Hello558{
    int show(){
        int a=0;

        try {
            System.out.println("try block begin: "+a);
            a=10/4;
            System.out.println("try block ends: "+ a);
            return a;
        } catch (ArithmeticException e) {
           a=20;
            System.out.println("catch block : "+a);
            return  a;
        }finally {
            System.out.println("finally block: "+a);
            int arr[]=new int[-1];
        }
    }
}