package com.bijo.learning.test;

import java.util.Scanner;

//palindrome number
public class Test22 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        int num1=num;

        while (num!=0){
            int rem=num%10;
            sum=sum*10 + rem;
            num=num/10;
        }
        if(sum==num1)
            System.out.println("Number "+num1+" is palindrome");
        else
            System.out.println("Number "+num1+" is not palindrome");
    }

}
