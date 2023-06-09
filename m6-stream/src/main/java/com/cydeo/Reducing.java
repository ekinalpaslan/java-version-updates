package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        //without initial value
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);

        System.out.println("Dish calories total");
        //without initial value
        int calTotal =  DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
                .get();

        int calTotal2 =  DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(0,(a,b) -> a+b);
//                .reduce(0, Integer::sum);

        //Max min sum
        Optional<Integer> summ = numbers.stream().reduce(Integer::sum);
        numbers.stream().reduce(Integer::max);
        numbers.stream().reduce(Integer::min);
        System.out.println("Sum: " + summ.get());

        System.out.println("Count");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
