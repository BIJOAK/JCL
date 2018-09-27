package com.bijo.learning.utilpackage.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab634 {
    public static void main(String[] args) {
        System.out.println("Employee Details");
        TreeSet set=new TreeSet();
        set.add(new Employee634(87,"Bijo"));
        set.add(new Employee634(99,"Anu"));
        set.add(new Employee634(15,"Karthik"));
        set.add(new Employee634(9,"Jyothika"));

        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Employee634 implements Comparable{
    int eid;
    String name;

    public Employee634(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee634){
            Employee634 emp= (Employee634) o;
            return this.name.compareTo(emp.name);
        }
        return 0;
    }

    @Override
    public String toString() {
        return  eid +"\t"+
                 name ;
    }
}