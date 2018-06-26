package com.bijo.learning.test;

import java.util.Scanner;

//perfect number or not, perfect number between 1-10000, total
public class Test30n31n32 {
    public static void main(String as[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter one number:");
        int num=sc.nextInt();
        int sum=0;
        int sum1;
        int limit=1000;
        int total=0;

        for (int i=1;i<num;i++){
            if(num%i==0)
                sum=sum+i;
        }

        if(sum==num)
            System.out.println("Number "+num+" is perfect number");
        else
            System.out.println("Number "+num+" is not perfect number");

        for (int num1=1;num1<=limit;num1++){
            sum1=0;
            for(int i=1;i<num1;i++){
                if (num1%i==0)
                    sum1=sum1+i;
            }
            if(sum1==num1) {
                System.out.println(num1);
                total=total+sum1;
            }
        }
        System.out.println(total);
    }
}
