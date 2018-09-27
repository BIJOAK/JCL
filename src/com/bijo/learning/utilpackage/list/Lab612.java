package com.bijo.learning.utilpackage.list;

import java.util.Enumeration;
import java.util.Vector;

public class Lab612 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Bijo");
        v.addElement("Anu");
        v.add(2,"Karthik");
        System.out.println(v);
        Enumeration em=v.elements();
        while (em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
        System.out.println("Main completed");
    }
}
