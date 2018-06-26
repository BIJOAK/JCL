package com.bijo.learning.test;

import java.util.Scanner;

//remainder without using %
public class Test5 {
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int rem=0;
        rem=a-(a/b)*b;

        System.out.println("Remainder is : "+rem);

    }
}
