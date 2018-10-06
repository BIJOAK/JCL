package com.bijo.learning.utilpackage.collectionsclass;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Lab663 {
    public static void main(String[] args) {
        Set s= Collections.singleton("Bijo");
        System.out.println(s);
//        s.add("Anu");

        List list=Collections.singletonList("Karthik");
        System.out.println(list);
//        list.add("Jyothika");
    }
}
