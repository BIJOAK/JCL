package com.bijo.learning.utilpackage.set;

import java.util.TreeSet;

public class Lab630 {
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

        System.out.println("--pollFirst/Last--");
        System.out.println(set);
        System.out.println(set.pollFirst());
        System.out.println(set);
        System.out.println(set.pollLast());
        System.out.println(set);
        System.out.println("--lower()<--");
        System.out.println(set.lower(8));
        System.out.println(set.lower(3));
        System.out.println("--higher--");
        System.out.println(set.higher(8));
        System.out.println(set.higher(50));
        System.out.println(set.higher(3));
        System.out.println("--ceiling--");
        System.out.println(set.ceiling(8));
        System.out.println(set.ceiling(12));
        System.out.println("--floor--");
        System.out.println(set.floor(8));
        System.out.println(set.floor(3));
    }
}
