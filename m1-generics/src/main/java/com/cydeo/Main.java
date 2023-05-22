package com.cydeo;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
 //     items.add("Apple");


        printDoubled(items);

        System.out.println("---------------------------------------------");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //Team accepting any object


    }

    private static void printDoubled(ArrayList<Integer> items){
        for (Integer i : items){
            System.out.println(i*2);
        }
    }

    //Team<String> brokenTeam = new Team<>("what kind of team");
    //Team<Integer> t2 = new Team<>("weirdo");

}
