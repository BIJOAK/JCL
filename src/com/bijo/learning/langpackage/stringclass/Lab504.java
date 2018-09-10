package com.bijo.learning.langpackage.stringclass;

public class Lab504 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("BIJO");
        System.out.println("C: "+sb.capacity());
        System.out.println("L:"+sb.length());
        sb.trimToSize();
        System.out.println("C:"+sb.capacity());
        System.out.println("L:"+sb.length());
    }
}
