package com.bijo.learning.utilpackage.collection;

import java.util.Enumeration;
import java.util.Properties;

public class Lab596 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.put("JLC-1","Bijo");
        p.put("JLC-2","Anu");
        p.put("JLC-3","Karthik");
        p.put("JLC-4","Jyothika");
        p.put("JLC-5","Saramma");

        System.out.println(p);
        Enumeration e =p.propertyNames();
        while (e.hasMoreElements()){
            String pname= (String) e.nextElement();
            String pvalue=p.getProperty(pname);
            System.out.println(pname+"\t"+pvalue);
        }

    }
}
