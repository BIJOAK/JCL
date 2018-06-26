package com.bijo.learning.test;

import java.util.Scanner;

//print first N even numbers, sum of them
public class Test12n13 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            if(i%2==0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of first "+num+" natural Even number is : "+sum);
    }
}
