package com.bijo.learning.test;
//first 10 fibonacci series and sum
public class Test36n37 {
    public static void main(String as[]){
        System.out.println("\n First 10 Fibonacci numbers");
        int a=0;
        int b=1;
        int sum=0;
        System.out.print(a+" "+b+" ");
        int c=a+b;
        sum=a+b;
        for(int i=3;i<=10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            sum=sum+c;
        }

        System.out.println("\n"+sum);

    }



}
