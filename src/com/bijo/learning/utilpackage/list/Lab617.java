package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab617 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        ListIterator lit=list.listIterator();
        while (lit.hasNext()){
            Object object=lit.next();
            System.out.println(object);
        }
    }
}
