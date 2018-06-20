package com.bijo.learning;


class Hello2 {
 char ch;
 void show(){

     System.out.println(ch==0);
     System.out.println(ch==' ');
     System.out.println(ch=='\u0000');

        }
}
public class Lab2 {
    public static void main(String [] as){

        Hello2 h = new Hello2();
        h.show();

    }

}
