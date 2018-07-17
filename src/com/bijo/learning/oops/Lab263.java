package com.bijo.learning.oops;

public class Lab263 {
    public static void main(String as[]){

        Student263 stu1= new Student263(99,"Bijo","bijo@gmail.com",9886123456L);
        stu1.show();
        Student263 stu2 =new Student263(88,"Anu","anu@gmail.com");
        stu2.show();
        Student263 stu3= new Student263(77,"Karthik");
        stu3.show();
        Student263 stu4=new Student263();
        stu4.show();
    }
}

class Student263{
    int sId;
    String sName;
    String sEmail;
    long sPh;

    Student263(int id,String name, String email,long ph){
        sId=id;
        sName=name;
        sEmail=email;
        sPh=ph;
        System.out.println("4-Arg constructor");
    }

    Student263(int id,String name, String email){
        sId=id;
        sName=name;
        sEmail=email;
        System.out.println("3-Arg constructor");
    }

    Student263(int id,String name){
        sId=id;
        sName=name;
        System.out.println("2-Arg constructor");
    }
    Student263(){
        System.out.println("Default constructor");
    }

    void show(){
        System.out.println(sId+"\t"+sName+"\t"+sEmail+"\t"+sPh);
    }
}
