package com.cydeo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);


        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Comparator<Integer> dSort = (o1,o2) -> new MyComparator().compare(o1,o2);

        Collections.sort(list,(o1,o2) -> (o1>o2) ? -1 : (o2<o1) ? 1 : 0);


        //Ascending Order [0, 5, 10, 15, 20]
        list.sort((o1,o2) -> o1.compareTo(o2));
        list.sort(Integer::compareTo);

        //Descending Order [20, 15, 10, 5, 0]
        list.sort((o2,o1) -> o1.compareTo(o2));

    }
}
