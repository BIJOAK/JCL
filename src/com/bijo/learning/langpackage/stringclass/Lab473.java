package com.bijo.learning.langpackage.stringclass;

public class Lab473 {
    public static void main(String[] args) {
        Student473 stu=new Student473();
        String st1=String.valueOf(stu);
        System.out.println(st1);
        Employee473 emp=new Employee473();
        String st2=String.valueOf(emp);
        System.out.println(st2);
    }
}
class Student473{

}
class Employee473{
    int eid;
    public String toString(){
        return "EID:"+ eid;
    }
}
