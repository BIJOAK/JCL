package com.bijo.learning.utilpackage.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab597 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        System.out.println(col);
        System.out.println("Size: "+ col.size());
        System.out.println("Empty: "+ col.isEmpty());
        System.out.println();
        col.add("Bijo");
        col.add("Anu");
        col.add("Karthik");
        col.add("Jyothika");
        col.add("Saramma");

        System.out.println(col);
        System.out.println("Size: "+ col.size());
        System.out.println("Empty: "+ col.isEmpty());

//        List<String> list= (List<String>) col;
//        List<String> list1= list.sort();

    }
}
