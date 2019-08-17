package com.github.dungnh3.java8tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tut1_ForEach {

    public static void main(String[] args) {

        //forEach and Map
        Map<String, Integer> mapItems = new HashMap<>();
        mapItems.put("A", 10);
        mapItems.put("B", 20);
        mapItems.put("C", 30);
        mapItems.put("D", 40);
        mapItems.put("E", 50);
        mapItems.put("F", 60);

        System.out.println("forEach and Map");
        mapItems.forEach((key, value) -> System.out.println("Item key: " + key + " Item value: " + value));

        //forEach and List
        List<String> listItems = new ArrayList<>();
        listItems.add("A");
        listItems.add("B");
        listItems.add("C");
        listItems.add("D");
        listItems.add("E");

        System.out.println("forEach and List");
        listItems.forEach(item -> System.out.println(item));
        System.out.println("or you can use");
        listItems.forEach(System.out::println);

    }
}
