package com.katetaier13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

    public String dateOfBirth;
    public String fullName;

    public Person(String dateOfBirth, String fullName) {
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
    }

    protected static String getCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
        return now.format(formatter);
    }

    public static String getYears(String dateOfBirth) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String currentDate = now.format(formatter);
        LocalDate startDate = LocalDate.parse(dateOfBirth);
        LocalDate endDate = LocalDate.parse(currentDate);
        return String.valueOf(Period.between(startDate, endDate)).substring(1, 3);
    }

    @Override
    public String toString() {
        return "Person{" + "dateOfBirth='" + dateOfBirth + '\'' + ", fullName='" + fullName + '\'' + '}';
    }
}
