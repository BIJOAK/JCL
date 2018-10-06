package com.bijo.learning.utilpackage.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab659 {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        System.out.println(queue);
        System.out.println("Size: "+queue.size());
        System.out.println("Peek: "+queue.peek());
        System.out.println("Size: "+queue.size());
        System.out.println("Elelemnt: "+queue.element());
        System.out.println("Size: "+queue.size());
        System.out.println("Poll: "+queue.poll());
        System.out.println("Size: "+queue.size());
    }
}
