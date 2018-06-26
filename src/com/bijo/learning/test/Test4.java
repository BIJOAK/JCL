package com.bijo.learning.test;

import java.util.Scanner;
//quotient witout using / operator
public class Test4 {
    public static void  main(String as[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int quotient=0;

        while (a>=b){
            a-=b;
            quotient++;
        }
     System.out.println("Quotiant is :" +quotient);
    }
}
