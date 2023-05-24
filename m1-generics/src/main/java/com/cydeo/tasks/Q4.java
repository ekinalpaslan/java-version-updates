package com.cydeo.tasks;

import java.util.List;

//Q4
public class Q4 {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}
