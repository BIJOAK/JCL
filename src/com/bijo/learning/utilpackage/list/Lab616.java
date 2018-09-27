package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab616 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        Iterator it=list.iterator();
        while (it.hasNext()){
            Object object=it.next();
            System.out.println(object);
        }
    }
}
