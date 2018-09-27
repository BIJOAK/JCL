package com.bijo.learning.utilpackage.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab599 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add("Bijo");
        col.add("Anu");

        Object arr[]=col.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            arr[i]="JAVA";
        }
        System.out.println(col);
    }
}
