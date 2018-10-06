package com.bijo.learning.utilpackage.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab664 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        System.out.println(list);

        System.out.println("\nreplacing Karthik  with Karthik bijo");
        Collections.replaceAll(list,"Karthik","Karthik bijo");
        System.out.println(list);

        Object max=Collections.max(list);
        System.out.println(max);

        Object min=Collections.min(list);
        System.out.println(min);

        System.out.println("\nreplacing all with bijo");
        Collections.fill(list,"bijo");
        System.out.println(list);
    }
}
