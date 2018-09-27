package com.bijo.learning.multithreading;

public class Lab584 {
    public static void main(String[] args) {
        Hello584 h1=new Hello584();
        Hello584 h2=new Hello584();
        MyThread584 th1= new MyThread584(h1);
        MyThread584 th2=new MyThread584(h1);
//        MyThread584 th2=new MyThread584(h2);
        th1.start();th2.start();
    }
}

class MyThread584 extends Thread{
    Hello584 h=null;
    MyThread584(Hello584 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello584{
    static void show(){
        Thread th=Thread.currentThread();
        synchronized (Hello584.class){
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
}