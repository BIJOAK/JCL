package com.bijo.learning.utilpackage.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab657 {
    public static void main(String[] args) {
        Queue<Student657> st=new PriorityQueue<>();
        st.add(new Student657());
        st.add(new Student657());
        System.out.println("Main completed");
    }
}

class Student657{}