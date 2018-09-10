package com.bijo.learning.exceptionhandling;

public class Lab569 {
    public static void main(String[] args) {
        System.out.println("main started");
        String nm="";

        try {
            StudentService569 serv=new StudentService569();
            nm=serv.getNameBySid(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main completed");
    }
}

class StudentService569{

    String getNameBySid(String sid){
        if (sid==null || sid.isEmpty() || !sid.equals("JLC-99"))
            throw new StudentNotFoundException569(sid);

        else
            return "Bijo";
    }
}

class StudentNotFoundException569 extends RuntimeException{
    StudentNotFoundException569(String sid){
        super(sid);
    }

}
