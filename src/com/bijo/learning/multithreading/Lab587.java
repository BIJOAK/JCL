package com.bijo.learning.multithreading;

import java.util.ArrayList;

public class Lab587 {
    public static void main(String[] args) {
        Hello587 h1=new Hello587();
        MyThread587 th1= new MyThread587(h1);
        MyThread587 th2= new MyThread587(h1);

        th1.start();th2.start();
    }
}

class MyThread587 extends Thread{
    Hello587 h;
    MyThread587(Hello587 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello587{
    synchronized void show(){
        ArrayList al=new ArrayList();
        Thread th=Thread.currentThread();
        synchronized (al) {
            for (int i = 0; i < 5; i++) {
                System.out.println(th.getName() + "-show():" + i + "\t" + this);
                try {
//                    wait(1000);
                    al.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
