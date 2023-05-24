package com.cydeo.tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//Q2
public class CountTest {
    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);



    }

    public static <T> int countIf(Collection<T> collection, UnaryPredicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }
}


