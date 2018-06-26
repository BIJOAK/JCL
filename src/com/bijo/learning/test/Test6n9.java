package com.bijo.learning.test;

import java.util.Scanner;

//print first N natural numbers, Sum of them
public class Test6n9 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n>=1){
            for (int i=1;i<=n;i++){
                System.out.print(i+" ");

            }

        }

        System.out.println();
        int j=1;
        int sum=0;
        while (n>=1){
            System.out.print(j+" ");
            sum=sum+j;
            n--;
            j++;

        }
        System.out.println();
        System.out.println("Sum of first N natural number is : "+sum);
    }
}
