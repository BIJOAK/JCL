package com.bijo.learning.utilpackage.set;

import java.util.HashSet;

public class Lab626 {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(new Student626(99));
        set.add(new Student626(99));
        set.add(new Student626(99));
        set.add(new Student626(99));

        System.out.println(set);

    }
}

class Student626{
    int sid;
    Student626(int sid){
        this.sid=sid;
    }
    @Override
    public String toString(){
        return ""+sid;
    }
}