package com.bijo.learning.wrapperclass;

public class Lab511 {
    public static void main(String[] args) {
        Character cref=new Character('A');
        char ch=cref.charValue();
        System.out.println(ch);

        Boolean b1= new Boolean(false);
        boolean b2=b1.booleanValue();

        Float f1=new Float(300.3434);
        float f2=f1.floatValue();
        byte b3=f1.byteValue();
        int n=f1.intValue();
        short s=f1.shortValue();
        long l=f1.longValue();
        double d=f1.doubleValue();

    }
}
