package com.bijo.learning.classandhashcode;

public class Lab445 {
    public static void main(String[] args) {
        System.out.println("\n With Employee ");
        Employee445 emp1=new Employee445(99,31903290);
        Employee445 emp2=new Employee445(99,31903290);
        Employee445 emp3=new Employee445(88,65799999);
        Employee445 emp4=emp1;
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());
        System.out.println(emp4.hashCode());
        System.out.println(emp1==emp2);
        System.out.println(emp1==emp3);
        System.out.println(emp1==emp4);
        System.out.println(emp3==emp4);
    }
}
class Employee445{
    int eid;
    long phone;
    Employee445(int eid,long phone){
        this.eid=eid;
        this.phone=phone;
    }
    public int hashCode(){
        return (int)(phone | eid);
    }
}