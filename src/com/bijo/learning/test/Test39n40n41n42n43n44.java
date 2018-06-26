package com.bijo.learning.test;

import java.util.Scanner;

public class Test39n40n41n42n43n44 {
    public static void main(String as[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N value");
        int n=sc.nextInt();
        char c='*';
        char c1;

        System.out.println("=========================");

        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=rows;cols++){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int rows=n;rows>=0;rows--){
            for (int cols=rows;cols>0;cols--){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        System.out.println("=========================");
        c1='A';
        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=rows;cols++){
                System.out.print(c1+" ");
            }
            System.out.println();
        }

        System.out.println("=========================");
        c1='A';
        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=rows;cols++){
                System.out.print(c1+" ");
            }
            System.out.println();
            c1++;
        }

        System.out.println("=========================");

        c1='A';
        for (int rows=1;rows<=n;rows++){
            for (int cols=1;cols<=rows;cols++){
                System.out.print(c1+" ");
                c1++;
            }
            System.out.println();

        }

        System.out.println("=========================");

        for (int i=1;i<=n;i++){
            if(i<=n/2+1){
                for(int j=1;j<=i;j++)
                    System.out.print(c);
            }
            else
                for (int j=n-i+1;j>0;j--)
                    System.out.print(c);
                    System.out.println();

        }

        System.out.println("=========================");
    }
}
