package com.bijo.learning.test;

import java.util.Scanner;

//Strong number, strong number between 100 and 10000, total
public class Test33n34n35 {
    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number:");
        int num = sc.nextInt();
        int limit = 100000;
        int sum = 0;
        int sum1;
        int num1 = num;
        int num2;
        int total=0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == num1)
            System.out.println("Number is strong: " + num1);
        else
            System.out.println("Number is not strong: " + num1);


        for (int j = 1; j <= limit; j++) {
            sum1=0;
            num2=j;
            while (num2 != 0) {
                int digit1 = num2 % 10;
                int fact1 = 1;
                for (int n = 1; n <= digit1; n++) {
                    fact1 = fact1 * n;
                }
                sum1 = sum1 + fact1;
                num2 = num2 / 10;
            }
            if (sum1 == j) {
                System.out.println("Number is strong: " + j);
                total=total+j;
            }
        }
        System.out.println(total);
    }
}
