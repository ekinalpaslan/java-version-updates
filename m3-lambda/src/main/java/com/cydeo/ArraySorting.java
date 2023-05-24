package com.cydeo;

import java.util.function.Predicate;

public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as  = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quicksort = () -> System.out.println("Quick Sorting");
        as.sort(quicksort);
        as.sort(() -> System.out.println("Quick Sorting"));
        //skipped implementation, there is no need QuickSort BubbleSort classes anymore

        //With Java 8 - you have access to a bunch of ready functional interfaces. exp Predicate



    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
