package com.bijo.learning.exceptionhandling;

public class Lab570 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            StudentService570 serv=new StudentService570();
            serv.getNameBySid(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main completed");
    }
}


class StudentService570{

    String getNameBySid(String sid) throws StudentNotFoundException570{
        if (sid==null || sid.isEmpty() || !sid.equals("JLC-99"))
            throw new StudentNotFoundException570(sid);

        else
            return "Bijo";
    }
}

class StudentNotFoundException570 extends RuntimeException{
    StudentNotFoundException570(String sid){
        super(sid);
    }

}

