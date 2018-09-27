package com.bijo.learning.utilpackage.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab602 {
    public static void main(String[] args) {
        Collection col1=new ArrayList();
        col1.add("Bijo");
        col1.add("Anu");
        System.out.println(col1+"\t"+col1.size());

        Collection col2=new ArrayList();
        col2.add("Karthik");
        col2.add("Jyothika");
        col1.addAll(col2);
        System.out.println(col1+"\t"+col1.size());
    }
}
