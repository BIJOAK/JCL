package com.bijo.learning.utilpackage.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab665 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("Y");
        list.add("R");
        list.add("P");
        list.add("S");

        System.out.println(list);
        System.out.println("\nreverse");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("\nrotate 2");
        Collections.rotate(list,2);
        System.out.println(list);

        System.out.println("\nrotate -3");
        Collections.rotate(list,-3);
        System.out.println(list);

        System.out.println("\nshuffle");
        for (int i = 0; i <5 ; i++) {
            Collections.shuffle(list);
            System.out.println(list);
        }

    }
}
