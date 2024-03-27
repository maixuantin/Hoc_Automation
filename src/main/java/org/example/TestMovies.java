package org.example;

import java.util.ArrayList;

public class TestMovies {
    public static void main(String[] args) {
        Movies movie1 = new Movies("Muranishi", "Megumi", "10 out of 10");
        Movies movie2 = new Movies("Steven Spielberg", "Jurassic Park", "100 out of 10");
        ArrayList<Movies> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        for (Movies b : movies) {
            System.out.println(b);
        }
    }
}