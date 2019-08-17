package com.github.dungnh3.java8tutorial;

import com.github.dungnh3.java8tutorial.entity.Developer;

import java.util.List;

public class Tut2_Comparator {

    public static void main(String[] args) {

        //Initial list Developer
        List<Developer> developers = Developer.getDevelopers();
        System.out.println("Initial data..");
        developers.forEach(item -> System.out.println(item));

        //Sort by age `Int` (The same type Long, Double, ...)
        System.out.println("Sort by age..");
        developers.sort((Developer r1, Developer r2) -> r1.getAge() - r2.getAge());
        developers.forEach(item -> System.out.println(item));

        //Sort by name `String`
        System.out.println("Sort by name..");
        developers.sort((Developer r1, Developer r2) -> r1.getName().compareTo(r2.getName()));
        developers.forEach(item -> System.out.println(item));
    }
}
