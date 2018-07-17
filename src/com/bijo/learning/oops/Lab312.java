package com.bijo.learning.oops;

public class Lab312 {
    public static void main(String[] args) {
        Hello312 h=new Hello312();
        h.sum(new int[0]);
        h.sum(new int[]{12,34,54});
        h.sum(new int[]{10,20,50,30});
//        h.sum();
//        h.sum(12,34,54);
//        h.sum(10,20,50,30);
    }
}
class Hello312{
    void sum(int arr[]){
        System.out.println("--sum(int[]");
        System.out.println("Length: "+arr.length);
        int s=0;
        for (int a:arr){
            s=s+a;
        }
        System.out.println("Sum is : "+s);
    }
}