package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;

public class Lab609 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Anu");
        list.add("Bijo");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        List list2=list.subList(1,3);

        System.out.println(list);
        System.out.println(list2);
    }
}
