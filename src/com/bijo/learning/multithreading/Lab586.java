package com.bijo.learning.multithreading;

import java.util.ArrayList;

public class Lab586 {
    public static void main(String[] args) {
        Hello586 h1=new Hello586();
        MyThread586 th1= new MyThread586(h1);
        MyThread586 th2= new MyThread586(h1);

        th1.start();th2.start();
    }
}

class MyThread586 extends Thread{
    Hello586 h;
    MyThread586(Hello586 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello586{
    synchronized void show(){
        ArrayList al=new ArrayList();
        Thread th=Thread.currentThread();
        synchronized (al) {
            for (int i = 0; i < 5; i++) {
                System.out.println(th.getName() + "-show():" + i + "\t" + this);
                try {
                    wait(1000);
//                    al.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
