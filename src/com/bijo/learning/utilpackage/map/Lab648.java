package com.bijo.learning.utilpackage.map;

import java.util.HashMap;
import java.util.Map;

public class Lab648 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("sid","JLC-99");
        map.put("name","Bijo");

        Map map1=new HashMap();
        map1.put("MKR","Mathikere");
        map1.put("BTM","BTM Layout");

        System.out.println(map);
        System.out.println(map1);
        map.putAll(map1);
        System.out.println(map);
        System.out.println(map1);
    }
}
