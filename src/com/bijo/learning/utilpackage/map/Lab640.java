package com.bijo.learning.utilpackage.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab640 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        System.out.println(map);
        System.out.println("Size: "+map.size());
        System.out.println("Is Empty: "+map.isEmpty());
        map.put("eid",new Integer(99));
        map.put("name","Bijo");
        map.put("phone",new Long(999809878));
        map.put("valid", new Boolean(true));
        System.out.println(map);
        System.out.println("Size: "+map.size());
        System.out.println("Is Empty: "+map.isEmpty());
    }
}
