package com.bijo.learning.test;
//Armstrong number between 2 and 1000
public class Test28n29 {
    public static void main(String as[]){
        System.out.println("Armstrong number between 2 and 1000");
        int limit=1000;
        int total=0;
        for (int num=2;num<=limit;num++){
            int sum=0;
            int num1=num;
            while (num1!=0){
                int digit=num1%10;
                sum=sum+(digit*digit*digit);
                num1=num1/10;
            }
            if(sum==num){
                System.out.println("Number "+num+" is Armstrong number");
                total=total+sum;
            }
        }
        System.out.println(total);
    }
}
