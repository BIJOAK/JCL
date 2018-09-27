package com.bijo.learning.utilpackage.set;

import java.util.HashSet;

public class Lab627 {
    public static void main(String[] args) {
        HashSet set=new HashSet();

        set.add(new Student627(99));
        set.add(new Student627(99));
        set.add(new Student627(99));
        set.add(new Student627(99));

        System.out.println(set);

    }
}

class Student627{
    int sid;
    Student627(int sid){
        this.sid=sid;
    }

    @Override
    public String toString(){
        return ""+sid;
    }

    @Override
    public int hashCode(){
        System.out.println("**hashCode()**");
        return sid;
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("**equals()**");
        if (obj instanceof Student627){
            Student627 st= (Student627)obj;
            return this.sid==st.sid;
        }
        return false;
    }
}