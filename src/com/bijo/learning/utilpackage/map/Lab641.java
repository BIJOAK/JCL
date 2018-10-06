package com.bijo.learning.utilpackage.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab641 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();

        map.put("eid",new Integer(99));
        map.put("name","Bijo");
        map.put("phone",new Long(999809878));
        map.put("valid", new Boolean(true));
        System.out.println(map);
        System.out.println(map.containsKey("eid"));
        System.out.println(map.containsKey("email"));
        System.out.println(map.containsValue("Bijo"));
        System.out.println(map.containsValue(new Integer(99)));
        System.out.println(map.containsValue("bijo"));

    }
}
