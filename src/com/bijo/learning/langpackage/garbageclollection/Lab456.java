package com.bijo.learning.langpackage.garbageclollection;

public class Lab456 {
    public static void main(String[] args) {
        Employee456 emp[]=new Employee456[500];
        for (int i = 0; i <emp.length ; i++) {
//            new Employee456("JCL-"+(i+1));
            emp[i]=new Employee456("JCL-"+ (i+1));
        }
    }
}

class Employee456{
    String eid;
    double add[]=new double[123456];
    Employee456(String eid){
        this.eid=eid;
        System.out.println("\n Object Created with id: "+ eid);
    }
    protected void finalize(){
        System.out.println("Finalize - "+eid);
    }

}