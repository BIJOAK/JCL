package com.bijo.learning.utilpackage.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab639 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new SBComparator());
        ts.add(new StringBuilder("Bijo"));
        ts.add(new StringBuilder("Anu"));
        ts.add(new StringBuilder("Karthik"));
        ts.add(new StringBuilder("Jyothika"));
        ts.add(new StringBuilder("Saramma"));

        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class SBComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof StringBuilder && o2 instanceof StringBuilder){
            String st1=o1.toString();
            String st2=o2.toString();
//            return st1.compareTo(st2); //ASC
            return st2.compareTo(st1); //DESC
        }
        return 0;
    }
}