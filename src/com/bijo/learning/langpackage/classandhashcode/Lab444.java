package com.bijo.learning.langpackage.classandhashcode;

public class Lab444 {
    public static void main(String[] args) {
        System.out.println("\n*** With Student");
        Student444 st1=new Student444(99,31903290);
        Student444 st2=new Student444(99,31903290);
        Student444 st3=new Student444(88,65799999);
        Student444 st4=st1;
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st3==st4);
    }
}
class Student444{
    int sid;
    long phone;
    Student444(int sid, long phone){
        this.sid=sid;
        this.phone=phone;
    }
}