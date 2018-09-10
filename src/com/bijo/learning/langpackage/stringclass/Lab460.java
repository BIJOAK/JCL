package com.bijo.learning.langpackage.stringclass;

import java.util.Scanner;

public class Lab460 {
    public static void main(String[] args) {
        String st1="Bijo";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bijo string: ");
        String st3=sc.nextLine();
        System.out.println("Re Enter Bijo String: ");
        String st4=sc.nextLine();
        String st5=st3.intern();
        String st6=st4.intern();
        System.out.println(st3==st4);
        System.out.println(st5==st6);
        System.out.println(st1==st5);
    }
}
