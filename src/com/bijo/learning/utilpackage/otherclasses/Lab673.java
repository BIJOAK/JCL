package com.bijo.learning.utilpackage.otherclasses;

import java.util.Date;

public class Lab673 {
    @Deprecated
    public static void main(String[] args) {
        Date dt=new Date();
        System.out.println(dt);
        System.out.println("date\t"+dt.getDate());
        System.out.println("month\t"+dt.getMonth());
        System.out.println("month+1\t"+(dt.getMonth()+1));
        System.out.println("year\t"+dt.getYear());
        System.out.println("year+1900\t"+(dt.getYear()+1900));
        System.out.println("hour\t"+dt.getHours());
        System.out.println("minute\t"+dt.getMinutes());
        System.out.println("sec\t"+dt.getSeconds());

        System.out.println("\nStoring the date");
        dt.setDate(9);
        dt.setMonth(2);
        dt.setYear(108);
        System.out.println(dt);

    }
}
