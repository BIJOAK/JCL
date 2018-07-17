package com.bijo.learning.oops;

public class Lab286 {
    public static void main(String[] args) {
        Hello286 h=new Hello286();
        h.show(10);
        System.out.println("Hello Guys");
    }
}
class Hello286{
    int show(int a){
        System.out.println("show()");
//        return ;
        return 0;
    }
}
