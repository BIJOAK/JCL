package com.bijo.learning.oops;

public class Lab269n270 {
    public static void main(String as[]){
        Student269 stu1= new Student269(88,"Bijo");
        stu1.show();
        Student269 stu2=new Student269(99,"Anu");
        stu2.show();
    }
}

class Student269{
    int sId;
    String sName;

    Student269(int sId,String sName){
        System.out.println("2-arg");
        this.sId=sId;
        this.sName=sName;
    }
    void show(){
        System.out.println(sId+"\t"+sName);
    }

}
