package com.bijo.learning.test;

import java.util.Scanner;

//print first N odd numbers, sum of them
public class Test10n11 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            if(i%2!=0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of first "+num+" natural Odd number is : "+sum);
    }
}
