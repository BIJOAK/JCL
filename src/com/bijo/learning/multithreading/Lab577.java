package com.bijo.learning.multithreading;

public class Lab577 {
    public static void main(String[] args) {
        ThreadGroup tg= new ThreadGroup("WE");

        MyThread577 mth=new MyThread577();
        Thread t1=new Thread(tg,mth,"JCL-Thread");
        Thread t2=new Thread(mth);
        t1.start();t2.start();
    }
}

class MyThread577 implements Runnable{
    @Override
    public void run() {
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        int pri=th.getPriority();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ "\t"+ th.getName()+"\t"+tg.getName()+"\t"+ pri);
        }
    }
}