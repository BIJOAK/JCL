package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab619 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Anu");
        list.add("Bijo");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        ListIterator lit=list.listIterator();

        System.out.println("Forward Order");
        while (lit.hasNext()){
            int indx=lit.nextIndex();
            Object object=lit.next();
            System.out.println(indx+"\t"+object);
        }
        System.out.println("Reverse Order");
        while (lit.hasPrevious()){
            int indx=lit.previousIndex();
            Object obj=lit.previous();
            System.out.println(indx+"\t"+obj);
        }
    }
}
