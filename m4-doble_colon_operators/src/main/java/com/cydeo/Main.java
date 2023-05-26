package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);

        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        //Reference to a Static Method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,20);

        //Reference to an Instance Method
        Calculator obj = new Calculator();
        Calculate s3 =  (x,y) -> obj.findMultiply(x,y);
        Calculate s4 = obj::findMultiply;

        //Reference to a Functional Interface in Java
        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> f1 = String::substring;   //obj is not created cause return type is same with non-static class

        //Reference to a Functional Interface accepting also the class name as a parameter
        Function<Integer,Double> b = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;    //you can just write class name without new obj
        b1.apply(new MyClass(),5);


        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> d1 = System.out::println;



    }
}
