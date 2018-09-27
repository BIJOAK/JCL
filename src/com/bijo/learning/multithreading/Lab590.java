package com.bijo.learning.multithreading;

public class Lab590 {
    public static void main(String[] args) throws InterruptedException {
        Greetings grt=new Greetings();
        grt.start();
//        grt.join();
        System.out.println("Greetings from Bijo!");
    }
}

class Greetings extends Thread{
    public void run(){
        for (int i = 10; i >=1 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}