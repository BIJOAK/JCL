package com.bijo.learning.utilpackage.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab666 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("Y");
        list.add("R");
        list.add("P");
        list.add("S");

        System.out.println(list);

        System.out.println("\n ascending");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\n descending");
        Collections.sort(list, new StringDescComp());
        System.out.println(list);
    }
}
class StringDescComp implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1= obj1.toString();
        String s2= (String) obj2;
        return s2.compareTo(s1);
    }
}