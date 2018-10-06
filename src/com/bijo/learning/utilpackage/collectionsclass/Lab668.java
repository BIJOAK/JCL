package com.bijo.learning.utilpackage.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab668 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new StringBuilder("F"));
        list.add(new StringBuilder("D"));
        list.add(new StringBuilder("Y"));
        list.add(new StringBuilder("U"));
        list.add(new StringBuilder("P"));
        list.add(new StringBuilder("L"));
        System.out.println(list);

        List synList= Collections.synchronizedList(list);
        System.out.println("sync \t"+synList);
        System.out.println("list \t"+list);

        List unList=Collections.unmodifiableList(list);
        System.out.println("un modi \t"+ unList);

        System.out.println("modifying list");
        list.add("Z");
        System.out.println("list \t"+list);
        System.out.println("un modi \t"+unList);
//        unList.add("Q");

    }
}
