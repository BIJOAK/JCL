package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;

public class Lab608 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Anu");
        list.add("Bijo");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");
        list.add("Bijo");

        System.out.println(list);

        int x=list.indexOf("Bijo");
        System.out.println(x);

        int y=list.lastIndexOf("Bijo");
        System.out.println(y);

    }
}
