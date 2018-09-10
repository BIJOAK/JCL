package com.bijo.learning.langpackage.garbageclollection;

public class Lab455 {
    public static void main(String[] args) {
        new Hello455().show();
        Hello455 h1=new Hello455();
        h1=null;
        Hello455 h2=new Hello455();
        Hello455 h3=new Hello455();
        h2=h3;
        new Hello455().m1();
        System.runFinalization();
        System.gc();
    }
}

class Hai455{
    public void finalize(){
        System.out.println("Hai-finalize");
    }
}

class Hello455{
    void show(){
        System.out.println("show()");
    }
    void m1(){
        System.out.println("m1-start");
        Hai455 h1=new Hai455();
        Hai455 h2=new Hai455();
        Hai455 h3=new Hai455();
    }
    public void finalize(){
        System.out.println("Hello-finalize");
    }
}