package com.bijo.learning.utilpackage.comparable;

import java.util.TreeSet;

public class Lab635 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(new Student635(22,"Bijo"));
    }
}

class Student635{
    int sid;
    String name;

    public Student635(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return  sid +"\t"+
                 name ;
    }
}