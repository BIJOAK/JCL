package com.bijo.learning.langpackage.tostring;

public class Lab446 {
    public static void main(String[] args) {
        Student446 st1=null;
        System.out.println(st1);
        st1=new Student446(99,"Bijo");
        System.out.println(st1);
        String str= new String("JLC");
        System.out.println(str);
        Integer ref=new Integer(123);
        System.out.println(ref);
    }
}
class Student446{
    int sid;
    String sname;
    Student446(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
}