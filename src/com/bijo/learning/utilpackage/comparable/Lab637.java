package com.bijo.learning.utilpackage.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab637 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new NameComparator());
        ts.add(new Student637(22,"Bijo"));
        ts.add(new Student637(24,"Anu"));
        ts.add(new Student637(2,"Karthik"));
        ts.add(new Student637(5,"Jyothika"));

        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Student637 {
    int sid;
    String name;

    public Student637(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return  sid +"\t"+
                 name ;
    }


}

class NameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student637 && o2 instanceof Student637){
            Student637 st1= (Student637) o1;
            Student637 st2= (Student637) o2;
            return st1.name.compareTo(st2.name);
        }
        return 0;
    }
}