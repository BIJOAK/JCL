package com.bijo.learning.utilpackage.collectionsclass;

import java.util.*;

public class Lab662 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");
        System.out.println();
        System.out.println(list);
        System.out.println("\nLIST to ENUMERATION");
        Enumeration enm= Collections.enumeration(list);
        while (enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
        Vector v=new Vector();
        v.add("A");
        v.add(99);
        v.add("B");
        System.out.println(v);
        System.out.println("\nENUMERATION TO LIST");
        Enumeration enumeration=v.elements();
        List list1=Collections.list(enumeration);
        System.out.println(list1);
    }
}
