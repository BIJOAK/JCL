package com.bijo.learning.utilpackage.otherclasses;

import java.util.Calendar;
import java.util.Date;

public class Lab674 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        Date dt=cal.getTime();
        System.out.println(dt);

        System.out.println("day: "+cal.get(Calendar.DATE));
        System.out.println("Day: "+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mon: "+cal.get(Calendar.MONTH));
        System.out.println("Mon+1: "+(cal.get(Calendar.MONTH)+1));
        System.out.println("Year: "+cal.get(Calendar.YEAR));
        System.out.println("Hour: "+cal.get(Calendar.HOUR));
        System.out.println("Hour of day: "+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("min: "+cal.get(Calendar.MINUTE));
        System.out.println("sec: "+cal.get(Calendar.SECOND));
        System.out.println("AM_PM: "+cal.get(Calendar.AM_PM));
        System.out.println("\nAdding 7 days");
        cal.add(Calendar.DATE,7);
        System.out.println(cal.getTime());
        System.out.println("\n set month as march");
        cal.set(Calendar.MONTH,Calendar.MARCH);
        System.out.println(cal.getTime());
    }
}
