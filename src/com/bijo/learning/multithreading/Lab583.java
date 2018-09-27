package com.bijo.learning.multithreading;

public class Lab583 {
    public static void main(String[] args) {
        Hello583 h1=new Hello583();
        Hello583 h2=new Hello583();
        MyThread583 th1= new MyThread583(h1);
//        MyThread583 th2=new MyThread583(h1);
        MyThread583 th2=new MyThread583(h2);
        th1.start();th2.start();
    }
}

class MyThread583 extends Thread{
    Hello583 h=null;
    MyThread583(Hello583 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello583{
     synchronized static void show(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <5 ; i++) {
            System.out.println(th.getName() + "-show():" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}