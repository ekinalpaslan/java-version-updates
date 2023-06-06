package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,6,6);
        list.forEach(System.out::println);      //belongs to Iterable interface

        System.out.println("-------------------");

        System.out.println("Filter");
        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);  //belongs to Stream interface

        System.out.println("Distinct");
        Stream<Integer> str = list.stream()
                .filter(i -> i%2==0)
                .distinct();
        str.forEach(System.out::println);

        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");
        list.stream()
                .filter(i -> i%2==0)
                .map(i -> i*2)
                .forEach(System.out::println);


        System.out.println("Task");
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(i -> i.length())
                .forEach(System.out::println);

    }
}
