package com.bijo.learning.stringclass;

public class Lab486 {
    public static void main(String[] args) {
        String str="Welcome to JLC, Java Learning Center,No 1 in Java Training and placement";
        System.out.println(str);
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.lastIndexOf("Java",46));
        System.out.println(str.lastIndexOf("Java",45));
//        from index is i-1
    }
}
