package com.bijo.learning.utilpackage.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab598 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add("Bijo");
        col.add("Anu");
        col.add("Karthik");
        col.add("Jyothika");
        col.add("Saramma");

        System.out.println(col.contains("Anu"));
        System.out.println(col.contains("Java"));
        System.out.println(col);

        System.out.println(col.remove("JDBC"));
        System.out.println(col.remove("Bijo"));
        System.out.println(col);
        col.clear();
        System.out.println(col);
        System.out.println(col.size());
    }
}
