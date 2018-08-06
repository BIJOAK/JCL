package com.bijo.learning.booleanequals;

public class Lab450 {
    public static void main(String[] args) {
        Student450 st1=new Student450(99,"Bijo");
        Student450 st2=new Student450(99,"Bijo");
        Student450 st3=new Student450(88,"Anu");
        Student450 st4=st1;
        System.out.println("using==op");
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st2==st3);

        System.out.println("using equals()");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));
        System.out.println(st2.equals(st3));
    }
}
class Student450{
    int sid;
    String sname;
    Student450(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
}