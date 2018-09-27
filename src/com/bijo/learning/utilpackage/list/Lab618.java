package com.bijo.learning.utilpackage.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab618 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");

        ListIterator lit=list.listIterator();
        System.out.println(list);
        while (lit.hasNext()){
            Object obj=lit.next();
            System.out.println(obj);
            if (obj.equals("Bijo")){
                lit.remove();
            }else {
                if (obj.equals("Anu")){
                    lit.set("AnuMB");
                }else {
                    if (obj.equals("Karthik")){
                        lit.add("KarthikBijo");
                    }
                }
            }
        }
        System.out.println(list);
    }
}
