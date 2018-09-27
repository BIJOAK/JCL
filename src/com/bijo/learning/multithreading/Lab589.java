package com.bijo.learning.multithreading;

public class Lab589 {
    public static void main(String[] args) {
        Service ser= new Service();
        ser.start();
        for (char ch='A';ch<='J';ch++){
            System.out.println("Main running "+ch);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Service extends Thread{
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Service thread is running "+i);
            if(i==5){
                int x=10/0;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}