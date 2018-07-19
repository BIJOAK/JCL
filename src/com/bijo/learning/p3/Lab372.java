package com.bijo.learning.p3;

public class Lab372 {
    public static void main(String[] args) {
        A372 aobj=new A372(98);
        System.out.println(aobj.getX());
        aobj.setX(123);
    }
}
class A372{
    private int x;
    A372(int x){
        this.x=x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
}