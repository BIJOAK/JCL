package com.bijo.learning.utilpackage.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Lab622 {
    public static void main(String[] args) {

        LinkedHashSet set=new LinkedHashSet();

        set.add("Bijo");
        set.add("Anu");
        set.add(99);
        set.add("Karthik");
        set.add("Jyothika");
        set.add("Bijo");


        System.out.println(set);

    }
}
