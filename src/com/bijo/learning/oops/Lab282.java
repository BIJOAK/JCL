package com.bijo.learning.oops;

public class Lab282 {
    public static void main(String as[]){
        Operation282.showRemainder(10,4);
        Operation282.showRemainder(10,0);

    }
}

class Operation282{
    static void showRemainder(int a,int b){
        if(b==0)
//            return 0;
        System.out.println(a%b);
    }
}
