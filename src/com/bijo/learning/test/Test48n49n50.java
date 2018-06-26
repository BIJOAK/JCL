package com.bijo.learning.test;

import java.util.Scanner;

public class Test48n49n50 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value:");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<n-(i-1);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
                for (int k1=1;k1<k;k1+=k){

                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int i=1;i<=n;i++){
            for (int j=i;j>1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=n-(i-1);k++){
                System.out.print("*");
                for (int k1=1;k1<k;k1+=k){

                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("=========================");

        for(int i=n;i>=1;i--){
            for (int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
