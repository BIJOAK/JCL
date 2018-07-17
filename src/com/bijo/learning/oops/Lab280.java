package com.bijo.learning.oops;

public class Lab280 {
    public static void main(String as[]){
        Operation280.showRemainder(10,4);
        Operation280.showRemainder(10,0);

    }
}

class Operation280{
    static void showRemainder(int a,int b){
        System.out.println(a%b);
    }
}