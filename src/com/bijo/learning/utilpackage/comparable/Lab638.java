package com.bijo.learning.utilpackage.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab638 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new StringDescComparator());
        ts.add("Bijo");
        ts.add("Anu");
        ts.add("Karthik");
        ts.add("Jyothika");

        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class StringDescComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String){
            String s1= (String) o1;
            String s2= (String) o2;
//            return s2.compareTo(s1);// DESC
            return  s1.compareTo(s2); //Asc
        }
        return 0;
    }
}