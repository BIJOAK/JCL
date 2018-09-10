package com.bijo.learning.systemclass;

import java.io.IOException;

public class Lab531 {
    public static void main(String[] args) throws IOException {
        Runtime rt=Runtime.getRuntime();
//        Process p=rt.exec("/Applications/Calculator.app");
//        //OPEN Welcome.txt FILE in NOTEPAD
//        String cmds[]={"notepad","/Users/z062198/Desktop/Learning/Reimburse.txt"};
//        Process p2=rt.exec(cmds);

        String cmds1[]={"/Applications/Google Chrome.app","http://www.jlcindia.com"};
        Process p3=rt.exec(cmds1);

        System.out.println("Press Enter to close all process");
        System.in.read();
//        p.destroy();
//        p2.destroy();
        p3.destroy();
        System.out.println("Main completed");
    }
}
