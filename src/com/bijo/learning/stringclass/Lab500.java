package com.bijo.learning.stringclass;

public class Lab500 {
    public static void main(String[] args) {
        String exp="[A-Za-z0-9]*";
        System.out.println("bijo".matches(exp));
        System.out.println("BIJOak".matches(exp));
        System.out.println("AK47".matches(exp));
    }
}
