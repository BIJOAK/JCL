package com.bijo.learning.utilpackage.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab667 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new StringBuilder("F"));
        list.add(new StringBuilder("D"));
        list.add(new StringBuilder("Y"));
        list.add(new StringBuilder("U"));
        list.add(new StringBuilder("P"));
        list.add(new StringBuilder("L"));
        System.out.println(list);

//        Collections.sort(list);
        System.out.println("\nsorting string builder");
        Collections.sort(list,new StringBuilderComp());
        System.out.println(list);
    }
}

class StringBuilderComp implements Comparator{
    public int compare(Object o1,Object o2){
        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2);
    }
}