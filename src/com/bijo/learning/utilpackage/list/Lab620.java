package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab620 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Anu");
        list.add("Bijo");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        ListIterator lit=list.listIterator(2);

        System.out.println("Forward Order");
        do {
            int indx=lit.nextIndex();
            Object object=lit.next();
            System.out.println(indx+"\t"+object);
        }while (lit.hasNext());

        System.out.println("Reverse Order");
        lit=list.listIterator(4);
        do {
            int indx=lit.previousIndex();
            Object obj=lit.previous();
            System.out.println(indx+"\t"+obj);
        }while (lit.hasPrevious());
    }
}
