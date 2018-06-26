package com.bijo.learning.lab;

public class Lab84 {
    public static void main(String as[]){
        int a=90;
        int b=9;

        System.out.println(a+b+" is result");
        System.out.println(a-b+" is result");
        System.out.println("Result is "+a+b);
//        System.out.println("Result is "+a-b);
        System.out.println("Result is "+(a+b));
        System.out.println("Result is "+(a-b));
        System.out.println("Result is "+a+-b);
        System.out.println("Result is "+a+(-b));

        int c=90;
//        String str=a;
        String str1=""+c;
        String str2=c+"";

        System.out.println(c);
        System.out.println(str1);
        System.out.println(str2);

        int a1=12;
        int b1=10;
        int c1= a1+b1;

        String str3="Sum of "+a1+" and "+b1+" is " +c1;
        System.out.println(str3);
        System.out.printf("\nSum of %d and %d is %d. \n",a1,b1,c1);
    }
}
