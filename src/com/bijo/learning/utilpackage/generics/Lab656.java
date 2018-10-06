package com.bijo.learning.utilpackage.generics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab656 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        System.out.println(map);
    }
}
