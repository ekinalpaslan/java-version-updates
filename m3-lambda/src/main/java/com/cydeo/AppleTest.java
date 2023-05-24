package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        List<Apple> heavyApple = filterApples(inventory,new AppleWeightPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);


        //lambda
        ApplePredicate appleWeightPredicate = (Apple apple) -> apple.getWeight()>200;
        List<Apple> heavyApple2 = filterApples(inventory, appleWeightPredicate);

        ApplePredicate appleGreenColorPredicate = apple -> apple.getColor().equals(Color.GREEN);
        List<Apple> greenApple2 = filterApples(inventory, appleGreenColorPredicate);


    }
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

}
