package com.cydeo.tasks;

import java.util.Arrays;

//Q1
public class SwapValues {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a)); //[3, 2, 1, 4]
    }


    //Q1
    public static <T> void swap(T[] arr, int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

