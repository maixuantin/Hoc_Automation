package org.example;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("abc", "edf", 789);
        Book book2 = new Book("hhh", "iii", 678);
        /*System.out.println(book1.toString());
        System.out.println(book2.toString());*/
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        for (Book b : books) {
            System.out.println(b);
        }
        books.remove(book1);
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
