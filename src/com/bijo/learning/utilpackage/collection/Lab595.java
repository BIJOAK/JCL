package com.bijo.learning.utilpackage.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab595 {
    public static void main(String[] args) {
        Vector v =new Vector();
        v.add("Bijo");
        v.add("Anu");
        v.add("Karthik");
        v.add("Jyothika");
        v.add("Saramma");
        System.out.println(v);

        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            Object obj=e.nextElement();
            System.out.println(obj);
        }
    }
}
