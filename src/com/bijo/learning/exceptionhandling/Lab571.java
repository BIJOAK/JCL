package com.bijo.learning.exceptionhandling;

public class Lab571 {
    public static void main(String[] args) throws StudentNotFoundException571{

        System.out.println("main started");
        StudentService571 serv=new StudentService571();
        serv.getNameBySid(null);
        System.out.println("main completed");
    }
}


class StudentService571{

    String getNameBySid(String sid) throws StudentNotFoundException571{
        if (sid==null || sid.isEmpty() || !sid.equals("JLC-99"))
            throw new StudentNotFoundException571(sid);

        else
            return "Bijo";
    }
}

class StudentNotFoundException571 extends RuntimeException{
    StudentNotFoundException571(String sid){
        super(sid);
    }

}
