package com.bijo.learning.multithreading;

public class Lab582 {
    public static void main(String[] args) {
        Hello582 h1=new Hello582();
        Hello582 h2=new Hello582();
        MyThread582 th1= new MyThread582(h1);
//        MyThread582 th2=new MyThread582(h1);
        MyThread582 th2=new MyThread582(h2);
        th1.start();th2.start();
    }
}

class MyThread582 extends Thread{
    Hello582 h=null;
    MyThread582(Hello582 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello582{
     void show(){
        Thread th=Thread.currentThread();
        synchronized (this){
        for (int i = 0; i <5 ; i++) {
            System.out.println(th.getName() + "-show():" + i + "\t" + this);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        }
    }
}