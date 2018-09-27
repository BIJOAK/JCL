package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab615 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        Iterator it=list.iterator();
        int x=list.size();
//        list.remove("Bijo");
        for (int i = 0; i < x; i++) {
            System.out.println(it.next());
        }
        System.out.println("Main completed");
    }
}
