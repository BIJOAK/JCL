package com.bijo.learning.oops;

public class Lab271 {
    public static void main(String as[]){
        Hello271 h=new Hello271(99);
        h.show();
    }

}

class Hello271{
    int a;
    Hello271(){
        System.out.println("Default constructor");
    }
    Hello271(int a){
        this();
        System.out.println("1-Arg");
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}