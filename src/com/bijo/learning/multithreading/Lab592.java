package com.bijo.learning.multithreading;

public class Lab592 {
    public static void main(String[] args) {
        Thread t1=Thread.currentThread();

        MyThread592 t2=new MyThread592();
        t2.setDaemon(true);
        t2.start();
        for (char ch='A';ch<'L'; ch++){
            System.out.println(t1.getName()+"\t"+ch+"\t"+t1.isDaemon());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread592 extends Thread{
    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println(getName()+"\t"+i+"\t"+isDaemon());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}