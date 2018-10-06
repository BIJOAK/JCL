package com.bijo.learning.utilpackage.map;

import java.util.*;

public class Lab644 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put("eid", new Integer(99));
        map.put("name","Bijo");
        map.put("phone", new Long(98876599L));
        map.put("valid", new Boolean(true));

        System.out.println("\n ****Keys and Values");
        Set data=map.entrySet();
        Iterator it = data.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            Map.Entry entry= (Map.Entry) obj;
            Object key=entry.getKey();
            Object val=entry.getValue();
            System.out.println("key: "+key+"\t"+"Val: "+val);
        }

    }
}
