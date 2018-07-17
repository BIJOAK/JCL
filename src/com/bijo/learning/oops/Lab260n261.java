package com.bijo.learning.oops;

public class Lab260n261 {
    public static void main(String as[]){
        Student260 st1 = new Student260();
        st1.sId=99;
        st1.sName ="Bijo";
        st1.show();
//        Student st2 = new Student();
//        st2.show();
    }
}

class Student260{
    int sId;
    String sName;

    Student260(){
        System.out.println("Student default constructor");
    }

    void show(){
        System.out.println(sId +"\t"+sName);
    }
}
