package com.bijo.learning.multithreading;

public class Lab579 {
    public static void main(String[] args) throws InterruptedException {
        MyThread579 th =new MyThread579();
        Thread t1=new Thread(th);
        System.out.println(t1.getState());
        t1.start();
        Thread.sleep(500);
        System.out.println(t1.getState());
        Thread.sleep(500);
        System.out.println(t1.getState());
    }

}

class MyThread579 extends Thread{
    public void run(){
        Thread th=currentThread();
        for (int i = 0; i <=10 ; i++) {
            System.out.println(th.getName()+"- value is: "+i+"\t"+th.getState());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}