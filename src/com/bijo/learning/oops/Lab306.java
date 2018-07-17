package com.bijo.learning.oops;

public class Lab306 {
    public static void main(String[] args) {
        Hello306 h =new Hello306();
        int n=4;
        long fact=h.factorial(n);
        System.out.println(n+" factorial is "+fact);
    }
}
class Hello306{
    long factorial(int n){
        if(n==1||n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
