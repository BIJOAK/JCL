package com.bijo.learning.utilpackage.list;

import java.util.Enumeration;
import java.util.Vector;

public class Lab610 {
    public static void main(String[] args) {
        Vector v=new Vector();
        Enumeration em=v.elements();
        System.out.println(em.nextElement());
        System.out.println("Main completed");
    }
}
