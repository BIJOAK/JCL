package com.bijo.learning.langpackage.designpattern;
//marker interface
public class Lab542 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st=new Student(99);
        System.out.println(st.sid);
        Student st2=st.myclone();
        System.out.println(st2.sid);
        System.out.println(st==st2);
//        String st3=st.clone();
    }
}

interface JLCCloneable{}

class Student implements JLCCloneable{
    int sid;
    Student(int sid){
        this.sid=sid;
    }

    public Student myclone()throws CloneNotSupportedException{
        if(this instanceof JLCCloneable){
            return new Student(sid);
        }else {
            throw new CloneNotSupportedException("Implement JCLCloneable");
        }
    }
}