package com.bijo.learning.memorymanagement;

public class Lab454 {
    public static void main(String[] args) {
        System.out.println("**Main started**");
        Runtime rt=Runtime.getRuntime();
        System.out.println("T: "+ rt.totalMemory());
        System.out.println("M: "+ rt.maxMemory());
    }
}
