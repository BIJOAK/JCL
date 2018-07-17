package com.bijo.learning.oops;

public class Lab295 {
    public static void main(String[] args) {
        Hello295 h=new Hello295();
//        h.show(65);
        h.show('A');
        h.show((char)65);
    }
}
class Hello295{
    void show(char x){
        System.out.println("show(char)");
    }
}
