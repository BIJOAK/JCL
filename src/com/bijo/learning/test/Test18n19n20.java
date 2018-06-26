package com.bijo.learning.test;

import java.util.Scanner;

//sum of square of individual digits of given number, cubes,
public class Test18n19n20 {
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int digit=0;
        int squareSum=0;
        int cubeSum=0;
        int factSum=0;

        while (num!=0){

            int fact=1;
            digit=num%10;
            for(int i=1;i<=digit;i++) {
                fact = fact * i;
            }
            factSum=factSum+fact;
            squareSum=squareSum + (digit*digit);
            cubeSum=cubeSum+(digit*digit*digit);
            num=num/10;

        }

        System.out.println("Sum of square is : "+squareSum);
        System.out.println("Sum of cubes is : "+cubeSum);
        System.out.println("Sum of factorial is : "+factSum);
    }
}
