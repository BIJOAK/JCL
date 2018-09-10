package com.bijo.learning.langpackage.tostring;

public class Lab447 {
    public static void main(String[] args) {
        Student447 st1=new Student447(99,"Bijo");
        System.out.println(st1);
        System.out.println("\n*** Default Implementation***");
        String cname=st1.getClass().getName();
        int hc=st1.hashCode();
        String hx=Integer.toHexString(hc);
        String msg=cname+"@"+hx;
        System.out.println(msg);
    }
}
class Student447{
    int sid;
    String sname;
    Student447(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
}