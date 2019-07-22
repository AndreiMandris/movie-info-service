package com.amandris.movieinfoservice.model;

public class Movie {
    private String movieId;
    private String name;
    private String test;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
