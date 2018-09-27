package com.bijo.learning.multithreading;

public class Lab585 {
    public static void main(String[] args) {
        Hello585 h1=new Hello585();
        MyThread585 th1= new MyThread585(h1);
        MyThread585 th2= new MyThread585(h1);

        th1.start();th2.start();
    }
}

class MyThread585 extends Thread{
    Hello585 h;
    MyThread585(Hello585 h){
        this.h=h;
    }
    public void run(){
        h.show();
    }

}

class Hello585{
    synchronized void show(){
        Thread th=Thread.currentThread();
            for (int i = 0; i <5 ; i++) {
                System.out.println(th.getName() + "-show():" + i+"\t"+this);
                try {
                    wait(1000);
//                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
