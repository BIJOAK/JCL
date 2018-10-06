package com.bijo.learning.utilpackage.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab642 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();

        map.put("eid",new Integer(99));
        map.put("name","Bijo");
        map.put("phone",new Long(999809878));
        System.out.println(map);

        System.out.println("remove(eid)"+map.remove("eid"));
        System.out.println("put -phone:"+map.put("phone",new Long(234234456)));
        System.out.println(map);
        System.out.println("get() "+map.get("name"));
        System.out.println(map.get("email"));

    }
}
