package com.bijo.learning.utilpackage.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab603 {
    public static void main(String[] args) {
        Collection col1=new ArrayList();
        col1.add("JDBC");
        col1.add("JSP");
        col1.add("Srinivas");
        col1.add("Java");
        col1.add("Dande");

        Collection col2=new ArrayList();
        col2.add("Java");
        col2.add("JDBC");
        col2.add("JSP");

        Collection col3=new ArrayList();
        col3.add("Java");
        col3.add("JDBC");
        col3.add("EJB");

        System.out.println(col1+"\n"+col2+"\n"+col3);
        System.out.println(col1.containsAll(col2));
        System.out.println(col1.containsAll(col3));

    }
}
