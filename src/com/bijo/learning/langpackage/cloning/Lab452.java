package com.bijo.learning.langpackage.cloning;

public class Lab452 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hai452 hai452=new Hai452(10);
        Hello452 h1=new Hello452(20,hai452);
        Hello452 h2=(Hello452) h1.clone();
        h1.show();
        h2.show();
        System.out.println(h1==h2);
        System.out.println(h1.hai452==h2.hai452);
        h2.y=30;
        h1.show();
        h2.show();
        h2.hai452.x=111;
        h1.show();
        h2.show();
    }
}

class Hai452{
    int x;
    Hai452(int x){
        this.x=x;
    }
}
class Hello452 implements Cloneable{
    int y;
    Hai452 hai452;
    Hello452(int y,Hai452 hai452){
        this.y=y;
        this.hai452=hai452;
    }
    void show(){
        System.out.println("Hello-->y: "+y);
        System.out.println("Hai.x-->x: "+hai452.x);
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}