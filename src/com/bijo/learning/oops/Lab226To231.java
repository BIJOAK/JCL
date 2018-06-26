package com.bijo.learning.oops;

public class Lab226To231 {
    int c;
    public static void main(String as[]){
        Hello h= new Hello();
        System.out.println(h.a);
        h.a=99;
        System.out.println(h.a);

        /****************/

        Hello h1=new Hello();
        Hello h2=new Hello();

        System.out.println(h1.a+"\t"+h2.a);
        h1.a=98;
        System.out.println(h1.a+"\t"+h2.a);


        /****************/
        new Hello().a=999;
        System.out.println(new Hello().a);

        /****************/

        Hello h3=null;
//        System.out.println(h3.a); //null pointer exception

        /****************/

//        System.out.println(Hello.a);// we have to create an object to access instance variable in static context

        /****************/

//        System.out.println(c);// we have to create an object to access instance variable in static context


    }


}

class Hello{
    int a;
}
