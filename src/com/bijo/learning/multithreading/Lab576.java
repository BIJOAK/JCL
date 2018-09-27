package com.bijo.learning.multithreading;

public class Lab576 {
    public static void main(String[] args) {
        ThreadGroup tg= new ThreadGroup("WE");
        MyThread576  t1= new MyThread576(tg,"JCL-Thread");
        MyThread576 t2= new MyThread576();
        t1.start();t2.start();
    }
}

class MyThread576 extends Thread{

    MyThread576(ThreadGroup tg, String name){
        super(tg,name);
    }

    MyThread576(){}

    public void run(){
        ThreadGroup tg=getThreadGroup();
        int pri=getPriority();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"\t"+getName()+"\t"+tg.getName()+"\t"+ pri);
        }
    }
}