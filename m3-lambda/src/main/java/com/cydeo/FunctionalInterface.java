package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {


        //Anonymous class
        ApplePredicate ap = new ApplePredicate() {  //AppleHeavyPredicate Class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };


        //Predicate
        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        //Consumer
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        //BiConsumer
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(20,15);

        //Function
        Function<String,String> fun = s -> "Hello" + s;
        System.out.println(fun.apply("Cydeo"));

        //BiFunction
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        //Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }
}
