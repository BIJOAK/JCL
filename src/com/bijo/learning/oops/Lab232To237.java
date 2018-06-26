package com.bijo.learning.oops;

public class Lab232To237 {
    static int c;
    public static void main(String as[]){

        Hello1 h1 = new Hello1();
        System.out.println(h1.b);
        h1.b=99;
        System.out.println(h1.b);

        /*************************/

        Hello1 h2 = new Hello1();
        Hello1 h3 = new Hello1();

        System.out.println(h2.b+"\t"+h3.b);
        h3.b=98;
        System.out.println(h2.b+"\t"+h3.b);

        /*************************/

        System.out.println(Hello1.b);// allowed in static context

        /*************************/

        Hello1 h4=null;
        System.out.println(h4.b);

        /*************************/

        new Hello1().b=999;
        System.out.println(new Hello1().b);

        /*************************/

        System.out.println(c);
    }
}

class Hello1{
    static int b;
}