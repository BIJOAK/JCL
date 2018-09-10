package com.bijo.learning.wrapperclass;

public class Lab510 {
    public static void main(String[] args) {
        int a=10;
        Integer in=new Integer(a);
        System.out.println(in);
        byte b1=123;
        Byte bref=new Byte(b1);
        System.out.println(bref);
        char c='A';
        Character cref=new Character(c);
        System.out.println(cref);

//        use Integer.valueOf()
    }
}
