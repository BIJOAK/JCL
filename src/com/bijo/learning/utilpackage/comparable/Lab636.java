package com.bijo.learning.utilpackage.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab636 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new SidComparator());
        ts.add(new Student636(22,"Bijo"));
        ts.add(new Student636(24,"Anu"));
        ts.add(new Student636(2,"Karthik"));
        ts.add(new Student636(5,"Jyothika"));

        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Student636 {
    int sid;
    String name;

    public Student636(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return  sid +"\t"+
                 name ;
    }


}
class SidComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student636 && o2 instanceof Student636){
            Student636 st1= (Student636) o1;
            Student636 st2= (Student636) o2;
            return st1.sid-st2.sid;
        }
        return 0;
    }
}