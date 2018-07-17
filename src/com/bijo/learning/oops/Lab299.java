package com.bijo.learning.oops;

public class Lab299 {
    public static void main(String[] args) {
        Hello299 h=new Hello299();
        String a=h.add(99,"Bijo");
        System.out.println(a);
        String b=h.add("Bijo",99);
        System.out.println(b);
    }
}
class Hello299{
    String add(int a,String b){
        System.out.println("add(int,String)");
        return a+b;
    }
    String add(String str,int a){
        System.out.println("add(String,int)");
        return str+a;
    }
}

