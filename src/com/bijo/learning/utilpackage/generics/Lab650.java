package com.bijo.learning.utilpackage.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab650 {
    public static void main(String[] args) {
        System.out.println("\n -- with Set---");
        Set<String> set=new HashSet<>();
        set.add("Bijo");
        set.add("Anu");
        set.add("Karthik");
        set.add("Jyothika");
        set.add("Saramma");
//        set.add(new Integer(99));
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
    }
}
