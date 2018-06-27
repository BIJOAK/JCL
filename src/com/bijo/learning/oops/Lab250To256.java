package com.bijo.learning.oops;

public class Lab250To256 {
    public static void main(String as[]){
    Hello4 h=new Hello4();

//    System.out.println("Main: "+h.a);

//        System.out.println("Main: "+Hello4.a);


    }
}

class Hello4{
//    int a;
//    static int b;
//    {
//        int c=30;
////        int c;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }

//    static int a;
//    static {
//        static int b; //error
//        System.out.println(a);
//        System.out.println(b);
//    }

//    static int a;
//    static {
//        final int b=20;
//        System.out.println(a);
//        System.out.println(b);
//    }
    {
        int a=10;
        System.out.println("I.Block 1:"+a);
    }
    static {
//        String a="JLC";
        int a=10;
        System.out.println("S.Block 2:"+a);

    }


}
