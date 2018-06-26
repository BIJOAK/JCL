package com.bijo.learning.test;

import java.util.Scanner;

public class Test45n46n47 {
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value:");
        int n=sc.nextInt();

        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=rows;cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        int num=1;
        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=rows;cols++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int rows=1;rows<=n;rows++){
            int num1=rows%2==0?0:1;
            for (int cols=1;cols<=rows;cols++){
                System.out.print(num1+" ");
                num1=num1==0?1:0;
            }
            System.out.println();
        }
    }
}
