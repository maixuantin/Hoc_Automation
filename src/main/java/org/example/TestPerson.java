package org.example;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Tin", 28);
        System.out.println(p1.toString());
        p1.setAge(42);
        p1.setName("Darren");
        System.out.println(p1.toString());
    }
}
