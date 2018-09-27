package com.bijo.learning.utilpackage.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab628 {
    public static void main(String[] args) {

        TreeSet set=new TreeSet();
        set.add(10);
        set.add(11);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        set.add(20);
        set.add(4);

        System.out.println(set);

        Set ts1=set.descendingSet();

        System.out.println(ts1);

        System.out.println("Ascending Order");

        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Descending Order");

        Iterator it2=set.descendingIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
