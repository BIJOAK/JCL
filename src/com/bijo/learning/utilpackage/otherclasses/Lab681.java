package com.bijo.learning.utilpackage.otherclasses;

import java.util.Scanner;

public class Lab681 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int val=sc.nextInt();
        System.out.println("Data is : "+val);
        System.out.println("Enter a Binary Value: ");
        int bin=sc.nextInt(2);
        System.out.println("Data is: "+bin);
        System.out.println("ENter a Long value: ");
        long l=sc.nextLong();
        System.out.println("Data is: "+l);
        System.out.println("Enter a string value:");
        String st=sc.next();
        System.out.println("Data is: "+st);
    }
}
