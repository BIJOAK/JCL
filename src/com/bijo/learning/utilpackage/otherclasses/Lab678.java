package com.bijo.learning.utilpackage.otherclasses;

import java.util.Locale;

public class Lab678 {
    public static void main(String[] args) {
        Locale locale=Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayLanguage());

        Locale locs[]=Locale.getAvailableLocales();
        for (Locale l:locs) {
            System.out.println(l.getDisplayLanguage()+"\t\t"
            +l.getDisplayCountry());
        }

    }
}
