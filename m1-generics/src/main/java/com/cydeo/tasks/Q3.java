package com.cydeo.tasks;

//Q3
public final class Q3 {
    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
        //return x > y ? x : y;
    }
}
/*
If the current object is considered "less than" the other object, the method should return a negative integer.
If the current object is considered "greater than" the other object, the method should return a positive integer.
If the current object is considered "equal to" the other object, the method should return 0.
 */