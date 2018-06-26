package com.bijo.learning.test;

import java.util.Scanner;
//prime number
public class Test24 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean flag=true;
        for (int j=2;j<num;j++) {
            for (int i = 2; i < j; i++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }

            }
            if(flag)
            System.out.print(j + " ");
        }
        System.out.println();
        if(flag)
            System.out.println("Number "+num+" is Prime");
        else
            System.out.println("Number "+num+" is not Prime");
    }
}
