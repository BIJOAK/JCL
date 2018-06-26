package com.bijo.learning.test;

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
    }
}
