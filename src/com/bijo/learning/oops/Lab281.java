package com.bijo.learning.oops;

public class Lab281 {
    public static void main(String as[]){
        Operation281.showRemainder(10,4);
        Operation281.showRemainder(10,0);

        }
        }

class Operation281{
    static void showRemainder(int a,int b){
        if(b==0)
            return;
        System.out.println(a%b);
    }
}

