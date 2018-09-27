package com.bijo.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab594 {
    public static void main(String[] args) {
        MyThread594 t1=new MyThread594();
        ExecutorService ser=Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            ser.execute(t1);
        }
    }
}

class MyThread594 implements Runnable{
    public void run(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <2 ; i++) {
            System.out.println(th.getName()+"\t"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(th.getName()+" task Completed");
        }
    }
}