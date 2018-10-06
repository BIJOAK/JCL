package com.bijo.learning.utilpackage.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab649 {
    public static void main(String[] args) {
        System.out.println("\n --Using generics--");
        List<String> list=new ArrayList<>();
        list.add("Bijo");
        list.add("Anu");
        list.add("Karthik");
        list.add("Jyothika");
        list.add("Saramma");
//        list.add(99);
//        list.add(new Integer(99));
        System.out.println(list);
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

        for(String ss:list){
            System.out.println("SS: "+ss);
        }
    }
}
