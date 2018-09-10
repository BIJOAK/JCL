package com.bijo.learning.exceptionhandling;

public class Lab568 {
    public static void main(String[] args) {
        System.out.println("main started");
        String nm="";

        try {
            StudentService568 serv=new StudentService568();
//            nm=serv.getNameBySid(null);
//            nm=serv.getNameBySid("");
//            nm=serv.getNameBySid("JLC-88");
            nm=serv.getNameBySid("JLC-99");
            System.out.println("Name: "+nm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main completed");
    }
}

class EmptySidException568 extends RuntimeException{}

class StudentService568{

    String getNameBySid(String sid){
        if (sid==null)
            throw new NullPointerException();
        else if (sid.isEmpty())
            throw new EmptySidException568();
        else if (sid.equals("JLC-99"))
            return "Bijo";
        else
            throw new StudentNotFoundException568(sid);
    }
}

class StudentNotFoundException568 extends RuntimeException{
    StudentNotFoundException568(String sid){
        super(sid);
    }
}