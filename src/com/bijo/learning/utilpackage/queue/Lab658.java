package com.bijo.learning.utilpackage.queue;

import java.util.PriorityQueue;

public class Lab658 {
    public static void main(String[] args) {

        int [] values={1,2,3,4,5,6,7};
        int len=values.length;
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for (int val: values){
            pq1.offer(val);
        }

        System.out.println(pq1);
        for (int i = 0; i <len ; i++) {
            System.out.println(pq1.poll()+" ");
        }

        System.out.println("-----String-------");
        String[] nms={"Bijo","Anu"};
        PriorityQueue<String> pq2=new PriorityQueue<>();
        int len2=nms.length;
        for (String n:nms
             ) {
            pq2.offer(n);
        }
        System.out.println(pq2);
        for (int i = 0; i < len2; i++) {
            System.out.println(pq2.poll()+" ");
        }
    }
}
