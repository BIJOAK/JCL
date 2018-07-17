package com.bijo.learning.oops;

public class Lab315 {
    public static void main(String[] args) {
        Hello315 h=new Hello315();
        h.show(10);
        h.show(10,20);
        h.show(10,20,30);
    }
}
class Hello315{
    void show(int a,int... arr){
        System.out.println("\nshow(int,int...)");
    }
}
