package com.bijo.learning.utilpackage.generics;

import java.util.ArrayList;
import java.util.List;

public class Lab635 {
    public static void main(String[] args) {

        ArrayList<Integer> inList=new ArrayList<>();
        inList.add(1234);
        inList.add(2345);
        inList.add(3456);

        showElements(inList);

        ArrayList<Float> flList=new ArrayList<>();
        flList.add(123.5f);
        flList.add(456.5f);
        flList.add(678.5f);

        showElements(flList);

        ArrayList<String> stlist=new ArrayList<>();
        stlist.add("bijo");
//        showElements(stlist);

    }
    static void showElements(List<? extends Number> list) {
        for (Number n: list){
            System.out.println(n+ ", ");
        }
        System.out.println("\n");
    }
}

