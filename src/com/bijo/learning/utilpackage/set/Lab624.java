package com.bijo.learning.utilpackage.set;

import java.util.TreeSet;

public class Lab624 {
    public static void main(String[] args) {

        TreeSet set=new TreeSet();

        set.add("Bijo");
        set.add("Anu");
        set.add("Karthik");
        set.add("Jyothika");
        set.add(99);
        set.add("Bijo");

        System.out.println(set);

    }
}
