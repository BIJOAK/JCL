package com.bijo.learning.langpackage.stringclass;

public class Lab499 {
    public static void main(String[] args) {
        String exp="[A-Z]*";
        System.out.println("S".matches(exp));
        System.out.println("HI".matches(exp));
        System.out.println("BIJO".matches(exp));
        System.out.println("bijo".matches(exp));
    }
}
