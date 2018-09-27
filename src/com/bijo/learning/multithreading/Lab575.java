package com.bijo.learning.multithreading;

public class Lab575 {
    public static void main(String[] args) {
        MyThread575 tt= new MyThread575();
        Thread t1=new Thread(tt);
        Thread t2=new Thread(tt);
        t1.start(); t2.start();
        Thread t=Thread.currentThread();
        for (int i =100; i <=110 ; i++) {
            System.out.println(t.getName()+"- value is: "+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread575 implements Runnable{
    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for (int i = 0; i <=10 ; i++) {
            System.out.println(th.getName()+" - value is: "+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}