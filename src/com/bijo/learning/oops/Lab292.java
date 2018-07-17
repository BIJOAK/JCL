package com.bijo.learning.oops;

public class Lab292 {
    public static void main(String[] args) {
        Hello292 h=new Hello292();
        System.out.println(h.isDigit('A'));
        System.out.println(h.isDigit('8'));
    }
}
class Hello292{
    boolean isDigit(char ch){
        System.out.println("isDigit():"+ch);
        if(ch>=48 && ch<=57)
            return true;
        else
            return false;
    }
}
