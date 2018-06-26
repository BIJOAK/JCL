package com.bijo.learning.oops;

public class Lab225 {
    public static void main(String as[]){
        Customer cs=new Customer();
        cs.show();
        Customer cs2=new Customer();
        cs2.customerId=99;
        cs2.customerName="Bijo";
        cs2.customerPhone=99999;
        cs2.show();

    }
}

class Customer{
    int customerId;
    String customerName;
    long customerPhone;
    void show(){
        System.out.println(customerId);
        System.out.println(customerName);
        System.out.println(customerPhone);
    }

}
