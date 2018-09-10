package com.bijo.learning.langpackage.stringclass;

public class Lab501 {
    public static void main(String[] args) {
        String exp="^[A-Z][A-Za-z0-9]*";
        System.out.println("bijo".matches(exp));
        System.out.println("BIJOak47".matches(exp));
        System.out.println("47AKbijo".matches(exp));
    }
}
