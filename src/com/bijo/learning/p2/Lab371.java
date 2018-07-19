package com.bijo.learning.p2;

import com.bijo.learning.p1.Hello;
public class Lab371 {
    public static void main(String[] args) {
        Hai hai=new Hai();
        hai.show();
    }
}


class Xyz extends Hello{

}

class Hai extends Hello{
    void show(){
        System.out.println("Hai-->show()");
        Hello hello=new Hello();
//        System.out.println(hello.ab);
        Xyz ref=new Xyz();
//        System.out.println(ref.ab);
        System.out.println(ab);
    }
}