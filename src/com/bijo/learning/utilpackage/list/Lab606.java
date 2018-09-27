package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;

public class Lab606 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Anu");
        list.add("BIJO");
        list.add("KARTHIK");
        list.add("Jyothika");

        System.out.println(list);
        list.add(1,"Saramma");

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
