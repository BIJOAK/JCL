package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;

public class Lab607 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Anu");
        list.add("Bijo");
        list.add("Karthik");
        list.add("Jyothika");

        System.out.println(list);
        list.set(1,"Saramma");
        System.out.println(list);

        Object obj=list.get(2);
        System.out.println(obj);
    }
}
