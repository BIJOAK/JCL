package com.bijo.learning.test;
//sum of prime numbers up to 10
public class Test26 {
    public static void main(String as[]){
        int limit=10;
        int sum=0;

        for(int num=1;num<=limit;num++){
            boolean flag=true;
            for(int i=2;i<num;i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                sum = sum + num;
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
