package com.bijo.learning.polymorphism;

public class Lab394 {
    public static void main(String[] args) {
        Person pob=null;
        pob=new Student();
        pob.walking();
        pob=new Employee();
        pob.walking();
    }
}
