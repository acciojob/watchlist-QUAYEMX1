package com.driver.Entities;

public class Director {

    private String directorName;
    private int noOfmovie;
    private double IMDBRating;

    public Director() {
    }

    public Director(String directorName, int noOfmovie, double IMDBRating) {
        this.directorName = directorName;
        this.noOfmovie = noOfmovie;
        this.IMDBRating = IMDBRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getNoOfmovie() {
        return noOfmovie;
    }

    public void setNoOfmovie(int noOfmovie) {
        this.noOfmovie = noOfmovie;
    }

    public double getIMDBRating() {
        return IMDBRating;
    }

    public void setIMDBrating(double IMDBRating) {
        this.IMDBRating = this.IMDBRating;
    }
}
