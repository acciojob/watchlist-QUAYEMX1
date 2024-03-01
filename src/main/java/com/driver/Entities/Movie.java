package com.driver.Entities;

public class Movie {

    private String movieName;
    private int timeDuration;
    private double imdbrating;

    public Movie() {
    }

    public Movie(String movieName, int timeDuration, double imdbrating) {
        this.movieName = movieName;
        this.timeDuration = timeDuration;
        this.imdbrating = imdbrating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    public double getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(double imdbrating) {
        this.imdbrating = imdbrating;
    }
}
