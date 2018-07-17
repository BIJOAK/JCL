package com.bijo.learning.oops;

public class Lab274n275 {
    public static void main(String as[]){
        Hello274 h =null;
//        h.show();
        h=new Hello274();
        h.show();
//        Hello274.show();

        Hello275 h1=null;
        h1.show();
        h1= new Hello275();
        h1.show();
        Hello275.show();
    }
}

class Hello274{
    void show(){
        System.out.println("Instance show()");
    }
}

class Hello275{
    static void show(){
        System.out.println("Static show()");
    }
}