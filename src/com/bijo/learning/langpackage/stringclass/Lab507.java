package com.bijo.learning.langpackage.stringclass;

public class Lab507 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("A");
        StringBuilder sb2=new StringBuilder("A");
        System.out.println(sb1.equals(sb2));

        String str1=sb1.toString();
        String str2=sb2.toString();
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.intern()==str2.intern());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.intern().hashCode());
        System.out.println(str2.intern().hashCode());
    }
}
