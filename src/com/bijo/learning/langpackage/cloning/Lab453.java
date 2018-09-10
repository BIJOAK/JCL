package com.bijo.learning.langpackage.cloning;

public class Lab453 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hai453 hai453=new Hai453(10);
        Hello453 h1=new Hello453(20,hai453);
        Hello453 h2=(Hello453)h1.clone();

        System.out.println(h1==h2);
        System.out.println(h1.hai453==h2.hai453);
        h1.show();
        h2.show();
        h2.y=11;
        h2.hai453.x=22;
        h1.show();
        h2.show();
    }
}

class Hai453{
    int x;
    Hai453(int x){
        this.x=x;
    }
}

class Hello453 implements Cloneable{
    int y;
    Hai453 hai453;
    Hello453(int y,Hai453 hai453){
        this.y=y;
        this.hai453=hai453;
    }
    void show(){
        System.out.println("Hello--> y: "+ y);
        System.out.println("Hai--> x: "+ hai453.x);
    }
    public Object clone()throws CloneNotSupportedException{
        if (this instanceof Cloneable){
            Hai453 hai453=new Hai453(this.hai453.x);
            Hello453 hello453=new Hello453(this.y,hai453);
            return hello453;
        }
        else throw new CloneNotSupportedException(getClass().getName());
    }
}