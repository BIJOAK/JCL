package com.bijo.learning.test;

import java.util.Scanner;

//read a number and display in word
public class Test23 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int digit=0;
        String msg="";

        while (num!=0){
            digit=num%10;
            switch (digit){
                case 0: msg="Zero " + msg; break;
                case 1: msg="One " + msg; break;
                case 2: msg="Two " + msg; break;
                case 3: msg="Three " + msg; break;
                case 4: msg="Four " + msg; break;
                case 5: msg="Five " + msg; break;
                case 6: msg="Six " + msg; break;
                case 7: msg="Seven " + msg; break;
                case 8: msg="Eight " + msg; break;
                case 9: msg="Nine " + msg; break;
                default:msg="Not a number ";

            }
            num=num/10;
        }
        System.out.println(msg);
    }
}
