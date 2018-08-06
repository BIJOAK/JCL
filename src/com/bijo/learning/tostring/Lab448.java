package com.bijo.learning.tostring;

public class Lab448 {
    public static void main(String[] args) {
        Student448 st1=new Student448(99,"Bijo");
        Student448 st2=new Student448(99,"Anu");
        System.out.println(st1);
        System.out.println(st2);

    }

}
class Student448{
    int sid;
    String sname;
    Student448(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
    public String toString(){
        return sid+"\t"+sname;
    }
}