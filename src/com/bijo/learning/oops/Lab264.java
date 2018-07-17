package com.bijo.learning.oops;


public class Lab264 {
    public static void main(String as[]){
        Student264 stu1=new Student264(99,"Bijo");
        stu1.show();
    }
}

class Student264{
    int sId;
    String sName;

    Student264(int id,String name){
        System.out.println("2 Arg");
        sId=id;
        sName=name;
    }

    Student264(){
        System.out.println("Default");
    }

    void show(){
        System.out.println(sId+"\t"+sName);
    }
}
