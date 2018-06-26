package com.bijo.learning.lab;

public class Lab39 {
    public static void main(String as[]){
        String str = null;
        System.out.println(str);
//        int a = str.length();     null pointer exception
//        System.out.println(a);

        String str1 = "";
        System.out.println(str1);
        String str2 = "BIJO";
        int b = str1.length();
        int c = str2.length();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(b);
        System.out.println(c);

        String str3 = "D:\new\test";
        String str4 = "D:\\new\\test";

        System.out.println(str3);
        System.out.println(str4);
//        System.out.println(9886035125); error
    }
}
