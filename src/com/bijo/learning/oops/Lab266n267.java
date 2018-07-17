package com.bijo.learning.oops;

public class Lab266n267 {
    public static void main(String as[]){
        Hello266 h =new Hello266();
        h.show();
    }
}

class Hello266{
    int a=10;
    void show(){
        String a="Bijo";
        System.out.println(a);
        System.out.println(this.a);
    }
}
