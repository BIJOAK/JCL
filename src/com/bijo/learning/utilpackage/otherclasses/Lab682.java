package com.bijo.learning.utilpackage.otherclasses;

import java.util.Scanner;

public class Lab682 {
    public static void main(String[] args) {
        String st="Hi This is JLC";
        Scanner sc=new Scanner(st);
        while (sc.hasNext()){
            String str=sc.next();
            System.out.println(str);
        }
        sc.close();
        System.out.println("*****************");

        String str2="Hi This is JLC. Java Training Center. NO 1 in Java Training";
        Scanner sc1=new Scanner(str2);
        sc1.useDelimiter("\\.");
        while (sc1.hasNext()){
            String st1=sc1.next();
            System.out.println(st1);
        }
        sc1.close();

    }
}
