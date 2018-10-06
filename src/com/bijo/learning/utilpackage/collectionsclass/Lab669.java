package com.bijo.learning.utilpackage.collectionsclass;


import java.util.Arrays;

public class Lab669 {
    public static void main(String[] args) {
        int[] arr={10,43,23,89,45};
        System.out.println("\nnatural order");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\nsorted order");
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n binary search 47");
        int indx=Arrays.binarySearch(arr,47);
        System.out.println(indx);
        indx=Arrays.binarySearch(arr,23);
        System.out.println(indx);

        System.out.println("\n equals (int[],int[])");
        int[] values={43,23,89,45,10};
        System.out.println(Arrays.equals(arr,values));
        int data[]={43,23,89,45,10};
        System.out.println(Arrays.equals(values,data));

    }
}
