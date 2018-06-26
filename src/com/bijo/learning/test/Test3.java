package com.bijo.learning.test;

import java.util.Scanner;
//sum without using + operator
public class Test3 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int carry;

        while (b!=0){
            carry=a&b;
            a=a^b;
            b=carry<<1;
        }

        System.out.println("Sum is " +a);
    }
}
