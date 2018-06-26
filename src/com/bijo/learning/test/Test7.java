package com.bijo.learning.test;

import java.util.Scanner;

//leap year or not
public class Test7 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year=sc.nextInt();

        if((year%400==0)||((year%4==0)&&(year%100!=0)))
            System.out.println("Year "+year+" is leap year");
        else
            System.out.println("Year "+year+" is not leap year");
    }

}
