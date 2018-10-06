package com.bijo.learning.utilpackage.generics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab651 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<Integer, String>();
        map.put(123,"A");
        map.put(124,"B");
        map.put(125,"C");
        map.put(126,"D");
        map.put(127,"E");

        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Iterator<Map.Entry<Integer,String>> it3=set.iterator();
        while (it3.hasNext()){
            Map.Entry<Integer,String> entry=it3.next();
            Integer key=entry.getKey();
            String val=entry.getValue();

            System.out.println("Key : "+key+"\t"+"Val : "+val);
        }

    }
}
