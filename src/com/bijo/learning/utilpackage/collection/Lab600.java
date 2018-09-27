package com.bijo.learning.utilpackage.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab600 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add("Bijo");
        col.add("Anu");
        col.add("Karthik");
        col.add("Jyothika");

        System.out.println(col);

        Iterator it=col.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
            if(obj=="Bijo"){
                it.remove();
            }
        }
        System.out.println(col);
    }
}
