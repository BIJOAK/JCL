package com.bijo.learning.utilpackage.map;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.*;

public class Lab643 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();

        map.put("eid",new Integer(99));
        map.put("name","Bijo");
        map.put("phone",new Long(999809878));
        System.out.println(map);

        System.out.println("\n***KEYS****");
        Set keys=map.keySet();
        Iterator it= keys.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
        System.out.println("\n***Values****");
        Collection col=map.values();
        Iterator it1=col.iterator();
        while (it1.hasNext()){
            Object obj=it1.next();
            System.out.println(obj);
        }

    }
}
