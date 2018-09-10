package com.bijo.learning.langpackage.booleanequals;

public class Lab449 {
    public static void main(String[] args) {
        String st1=new String("Bijo");
        String st2=new String("Bijo");
        String st3=new String("Anu");
        System.out.println("using==op");
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println("using equals()");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
    }
}
