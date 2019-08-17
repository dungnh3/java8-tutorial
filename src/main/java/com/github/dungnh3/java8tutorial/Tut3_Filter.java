package com.github.dungnh3.java8tutorial;

import com.github.dungnh3.java8tutorial.entity.Developer;

import java.util.List;
import java.util.stream.Collectors;

public class Tut3_Filter {

    public static void main(String[] args) {

        //Initial
        List<Developer> developers = Developer.getDevelopers();
        System.out.println("Initial list");
        developers.forEach(System.out::println);

        //Filter by name
        developers.stream().filter(r -> "iris".equals(r.getName()))
                .collect(Collectors.toList());

    }
}