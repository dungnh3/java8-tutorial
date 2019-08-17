package com.github.dungnh3.java8tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Developer {

    private final String name;
    private final BigDecimal salary;
    private final int age;

    public static List<Developer> getDevelopers() {
        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        developers.add(new Developer("alvin", new BigDecimal("80000"), 20));
        developers.add(new Developer("jason", new BigDecimal("100000"), 10));
        developers.add(new Developer("iris", new BigDecimal("170000"), 55));
        return developers;
    }
}
