package com.bijo.learning.test;
//prime numbers between 100 nad 200
public class Test25 {
    public static void main(String as[]){

        System.out.println("\n **Sum of prime numbers between 100-200 Number");
        int limit=200;
        for (int num=100;num<=limit;num++){
            boolean flag=true;
            for (int i=2;i<num;i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println(num+" ");
        }
    }
}
