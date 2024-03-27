package org.example;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tin", 1500, LocalDate.parse("2021-02-23"));
        System.out.println(employee1.years());
        System.out.println(employee1.toString());
    }
}
