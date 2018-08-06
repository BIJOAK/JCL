package com.bijo.learning.test;

import java.nio.ByteBuffer;
import java.util.Scanner;

public class Test38 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value");
        int n=sc.nextInt();
        char c='*';
        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=5;cols++){
                System.out.print(c+" ");
            }
            System.out.println();

        }
        char result =  0x0C;
        int result1= 0x0C;
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);
    }

}
