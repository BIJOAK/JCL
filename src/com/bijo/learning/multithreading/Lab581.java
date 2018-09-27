package com.bijo.learning.multithreading;

import com.bijo.learning.p1.Hello;

public class Lab581 {
    public static void main(String[] args) {
        Hello581 h1=new Hello581();
        Hello581 h2=new Hello581();
        MyThread581 th1= new MyThread581(h1);
        MyThread581 th2=new MyThread581(h1);
//        MyThread581 th2=new MyThread581(h2);
        th1.start();th2.start();
    }
}

class MyThread581 extends Thread{
    Hello581 h=null;
    MyThread581(Hello581 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello581{
    synchronized void show(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <5 ; i++) {
            System.out.println(th.getName()+"-show():"+i+"\t"+this);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}