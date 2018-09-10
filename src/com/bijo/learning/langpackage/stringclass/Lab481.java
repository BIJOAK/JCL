package com.bijo.learning.langpackage.stringclass;

public class Lab481 {
    public static void main(String[] args) {
        String str="Hai, Welcome to JLC(Java Learning Center), Java World";
        String st1=str.replace('J','X');
        System.out.println(st1);
        String st2=str.replaceFirst("Java","SD");
        System.out.println(st2);
        String st3=str.replaceAll("Java","SD");
        System.out.println(st3);
        System.out.println(str);
    }
}
