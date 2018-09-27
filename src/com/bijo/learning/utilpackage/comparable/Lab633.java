package com.bijo.learning.utilpackage.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {
    public static void main(String[] args) {
        System.out.println("Student info");
        TreeSet set=new TreeSet();
        set.add(new Student633(87,"Bijo"));
        set.add(new Student633(99,"Anu"));
        set.add(new Student633(15,"Karthik"));
        set.add(new Student633(9,"Jyothika"));

        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Student633 implements Comparable{
    int sid;
    String name;

    public Student633(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Student633){
            Student633 st= (Student633) o;
            return this.sid-st.sid;
        }
        return 0;
    }

    @Override
    public String toString() {
        return
                 sid +"\t"+
                name ;
    }
}