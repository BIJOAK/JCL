package com.bijo.learning.utilpackage.collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab661 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");
        System.out.println(list);

        List list1=new ArrayList();
        list1.add("Father");
        list1.add("Mother");
        list1.add("Brother");
        list1.add("Sister");
        list1.add("Aunt");

        System.out.println("List2: "+ list1);
        Collections.copy(list1,list);
        System.out.println("List2: "+ list1);
        Collections.sort(list1);
        System.out.println("List2: "+ list1);

    }
}
