package com.bijo.learning.test;

import java.io.IOException;
import java.util.Scanner;

//check whether the character is Upper case or lower case alphabet, digit or special character
public class Test8 {
    public static void main(String as[]) throws IOException {
        System.out.println("Enter the character:");
        char  ch=(char) System.in.read();

        if(ch>=65&&ch<=90)
            System.out.println("Upper case: "+ch);
        else if(ch>=97&&ch<=122)
            System.out.println("Lower case: "+ch);
        else if(ch>=48&&ch<=57)
            System.out.println("Digit: "+ch);
        else
            System.out.println("Special: "+ch);

    }
}
