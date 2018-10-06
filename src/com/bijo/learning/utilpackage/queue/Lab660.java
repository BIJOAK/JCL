package com.bijo.learning.utilpackage.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab660 {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.offer("D");
        queue.offer("E");
        queue.add("F");

        int len=queue.size();
        for (int i = 0; i < len; i++) {
            System.out.println(queue.poll());
        }
        System.out.println("\n****************");
        Queue<String> queue1=new PriorityQueue<>(10,new PSort());
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        queue1.offer("D");
        queue1.offer("E");
        queue1.add("F");

        int len2=queue1.size();
        for (int i = 0; i < len2; i++) {
            System.out.println(queue1.poll());
        }

    }
}

class PSort implements Comparator<String>{
    public int compare(String s1,String s2){
        return s2.compareTo(s1);
    }
}
