package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("321351435","211315351")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("521435144","315135162")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("212143513","135143543"))
        );
    }
}
