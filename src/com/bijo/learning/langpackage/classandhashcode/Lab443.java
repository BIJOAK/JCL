package com.bijo.learning.langpackage.classandhashcode;

public class Lab443 {
    public static void main(String[] args) {
        showClassInfo("JLC");
        Student443 stu=new Student443();
        showClassInfo(stu);
        Object obj=new Object();
        showClassInfo(obj);
    }

    static void showClassInfo(Object obj){
        Class cls=obj.getClass();
        System.out.println("Class Name : "+cls.getName());
        Class scls=cls.getSuperclass();
        if (scls!=null){
            System.out.println("Supper Class : "+scls.getName());
        }else {
            System.out.println("No Super Class");
        }
    }
}
class Person443{}
class Student443 extends Person443{}