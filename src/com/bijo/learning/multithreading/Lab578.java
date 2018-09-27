package com.bijo.learning.multithreading;

public class Lab578 {
    public static void main(String[] args) {
        MyThread578 mth=new MyThread578();
        mth.setPriority(10);
//        mth.setPriority(0);
//        mth.setPriority(11);
        System.out.println(mth);
    }
}

class MyThread578 extends Thread{}