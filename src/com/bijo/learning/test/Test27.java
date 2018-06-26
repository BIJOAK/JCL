package com.bijo.learning.test;

import java.util.Scanner;

//armstrong number
public class Test27 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number:");
        int num=sc.nextInt();

        int sum=0,num1=num;
        while (num!=0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if (sum==num1)
            System.out.println("Number "+num1+" is Armstrong number");
        else
            System.out.println("Number "+num1+" is not Armstrong number");
    }
}
