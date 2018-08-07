package com.bijo.learning.stringclass;

public class Lab477 {
    public static void main(String[] args) {
        String str="JLC";
        String st1=str.trim();
        System.out.println(str+"\t"+st1);
        System.out.println(st1==str);
        String st2=" JLC ";
        String st3=st2.trim();
        System.out.println(st2==st3);
        System.out.println(st2+"\t"+st2.length());
        System.out.println(st3+"\t"+st3.length());

    }
}
