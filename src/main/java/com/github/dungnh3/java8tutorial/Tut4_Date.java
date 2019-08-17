package com.github.dungnh3.java8tutorial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tut4_Date {

    public static void main(String[] args) {

        convertStringToLocalDate("2019-08-17");
    }

    public static void convertStringToLocalDate(String strDate) {
        LocalDate localDate = LocalDate.parse(strDate);
        System.out.println(localDate);
    }

    public static void convertStringToLocalDate(String strDate, String formater) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formater);
        LocalDate localDate = LocalDate.parse(strDate, formatter);
    }
}
