package com.bijo.learning.polymorphism;

public class Lab393 {
    public static void main(String[] args) {
        Person pob= null;
        pob= new Student();
        pob.eating();
        pob= new Employee();
        pob.eating();

    }
}
