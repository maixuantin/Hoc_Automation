package org.example;

public class Movies {
    private String director;
    private String actor;
    private String reviews;
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public Movies(String director, String actor, String reviews) {
        this.director = director;
        this.actor = actor;
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", reviews='" + reviews + '\'' +
                '}';
    }
}
