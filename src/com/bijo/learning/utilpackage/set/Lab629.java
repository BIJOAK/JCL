package com.bijo.learning.utilpackage.set;

import java.util.TreeSet;

public class Lab629 {
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add(10);
        set.add(11);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        set.add(20);
        set.add(4);

        System.out.println(set);

        System.out.println("--subset--");
        System.out.println(set.subSet(4,11));
        System.out.println(set.subSet(4,false,11,true));
        System.out.println("--headset--");
        System.out.println(set.headSet(9));
        System.out.println(set.headSet(9,true));
        System.out.println(set.headSet(2));
        System.out.println("--tailset--");
        System.out.println(set.tailSet(9));
        System.out.println(set.tailSet(9,false));

    }
}
