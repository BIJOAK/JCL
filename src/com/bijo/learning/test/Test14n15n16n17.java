package com.bijo.learning.test;

import java.util.Scanner;

//number of digits available in a given number, even and odd,sum, sum of even and odd
public class Test14n15n16n17 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int edigit=0;
        int odigit=0;
        int esum=0;
        int osum=0;
        int sum=0;


        System.out.println("\n **Individual digit of a number is ***\n");
        while (num!=0){
            int digit=num%10;
            if(digit%2!=0) {
                osum = osum + digit;
                odigit++;
            }
            else {
                esum = esum + digit;
                edigit++;
            }

            System.out.println(digit);
            sum=sum+digit;
            num=num/10;
        }

        System.out.println("Total number of Even digts : "+edigit);
        System.out.println("Sum of Even digts : "+esum);
        System.out.println("Total number of Odd digts : "+odigit);
        System.out.println("Sum of of Odd digts : "+osum);
        System.out.println("Sum of digts : "+sum);
    }
}
