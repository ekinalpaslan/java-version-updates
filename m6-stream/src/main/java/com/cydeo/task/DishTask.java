package com.cydeo.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        System.out.println("name - less than 400 calories");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        System.out.println("length");
        DishData.getAll().stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        //Print three high caloric dish name (>300)
        System.out.println("name - three high caloric >300");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("name - below 400 calories - sorted");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
//                .sorted(Comparator.comparing(Dish::getCalories))
                .sorted(comparing(Dish::getCalories))   //import static
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
