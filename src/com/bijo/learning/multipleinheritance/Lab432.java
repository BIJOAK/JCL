package com.bijo.learning.multipleinheritance;

public class Lab432 {
    public static void main(String[] args) {
        Inter432 arr[]=null;
//        Inter432 arr[]=new B[3];
//        arr=new B[3];
        arr[0]=new B432();
        arr[1]=new B432();
        arr[2]=new C432();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
interface Inter432{}
class A432 implements Inter432{}
class B432 extends A432{}
class C432 extends A432{}