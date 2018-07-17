package com.bijo.learning.oops;

public class Lab265 {

    public static void main(String as[]){
        Student265 stu1=new Student265();
        stu1.Student265(99,"Bijo");
        stu1.show();
//        Student265 stu2 =new Student265(88,"Anu");
    }
}

class Student265{
    int sId;
    String sName;

    void Student265(int id,String name){
        System.out.println("2 Arg");
        sId=id;
        sName=name;
    }

    Student265(){
        System.out.println("Default");
    }

    void show(){
        System.out.println(sId+"\t"+sName);
    }
}