package com.bijo.learning.oops;

public class Lab257To259 {
    public static void main(String as[]){
        System.out.println("I am main:");

//        int a=90;
        {
            int a=10;
            System.out.println("I am Local block 1 in main():"+a);
        }
        int a=90;
        System.out.println("I am main:"+a);
//        {
//            int a=20;
//            System.out.println("I am Local block 2 in main():"+a);
//        }
//        {
//            String a="JLC";
//            System.out.println("I am Local block 3 in main():"+a);
//        }
    }
}
