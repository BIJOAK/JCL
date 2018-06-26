package com.bijo.learning.test;

import java.util.Scanner;

//reverse of a given number
public class Test21 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int rem=0;
        while (num!=0){

            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of number is: "+rev);
    }
}
