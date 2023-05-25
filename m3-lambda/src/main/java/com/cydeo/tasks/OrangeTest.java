package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(80, Color.ORANGE));
        inventory.add(new Orange(155, Color.RED));
        inventory.add(new Orange(120, Color.ORANGE));
        inventory.add(new Orange(100, Color.RED));




        OrangeFormatter orangeColor = (Orange orange) -> {
            String weight = orange.getWeight() < 130 ? "Light " : "Heavy ";
            return "An " + weight +" "+ orange.getColor() + " orange";
        };
        OrangeFormatter orangeWeight = (Orange orange) -> "An orange of " + orange.getWeight() + "g";

        prettyPrintOrange(inventory, orangeColor);
        prettyPrintOrange(inventory, orangeWeight);

    }

    public static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }

}

