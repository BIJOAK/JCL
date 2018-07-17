package com.bijo.learning.test;

import java.util.Scanner;
//swap two numbers with using bitwise operator
public class Test2 {
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swap\na="+a+"\nb="+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swap\na="+a+"\nb="+b);
    }
}
