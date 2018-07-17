package com.bijo.learning.oops;

public class Lab262 {
    public static void main(String as []){

        Student262 stu1 =new Student262(88,"Bijo");
        stu1.show();
        Student262 stu2= new Student262(99,"Anu");
        stu2.show();

    }
}

class Student262{
    int sId;
    String sName;

    Student262(int id, String name){
        System.out.println("Student 2 arg constructor");
        sId=id;
        sName=name;
    }

    void show(){
        System.out.println(sId+"\t"+sName);
    }
}
