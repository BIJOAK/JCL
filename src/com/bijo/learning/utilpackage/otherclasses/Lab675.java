package com.bijo.learning.utilpackage.otherclasses;

import java.util.Calendar;

public class Lab675 {
    public static void main(String[] args) {
        Calendar today=Calendar.getInstance();
        Calendar cal=Calendar.getInstance();

        cal.set(Calendar.DATE,13);
        cal.set(Calendar.MONTH,5);
        cal.set(Calendar.YEAR,2014);

        System.out.println(cal.getTime());
        System.out.println(today.getTime());
        System.out.println("After today: "+today.after(cal));
        System.out.println("Before Today: "+today.before(cal));
        System.out.println("compareTo: "+today.compareTo(cal));
    }
}
