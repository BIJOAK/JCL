package com.bijo.learning.multithreading;

public class Lab574 {
    public static void main(String[] args) {
        MyThread574 t1=new MyThread574();
        MyThread574 t2=new MyThread574();
        t1.start(); t2.start();
        Thread t=Thread.currentThread();
        for (int i = 100; i <=110 ; i++) {
            System.out.println(t.getName()+"- value is: "+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread574 extends Thread {
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 0; i <= 10; i++) {
            System.out.println(th.getName() + " - value is :" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}