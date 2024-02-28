package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieService {

    movieRepository mop = new movieRepository();


    public void addMovie(Movie movie) {

        mop.addMovie(movie);
    }

    public void addDirector(Director director) {

        mop.addDirector(director);
    }

    public Movie getMovie(String moviename) {

        List<Movie> movielist = mop.moviesadded();

        Movie ans = null;
        for (Movie it : movielist) {
            if (it.getMoviesName().equals(moviename)) {
                ans = it;
            }
        }
        return ans;
    }


    public Director getDirector(String directorname) {

        List<Director> directorList = mop.getAllDirector();
        Director ans = null;

        for (Director d : directorList) {
            if (d.getDirectorName().equals(directorname)) {
                ans = d;
            }
        }

        return ans;
    }


    public List<Movie> getMovieDirectorName(Director name) {

        List<Movie> res = mop.getMovie(name);

        return res;
    }

    public List<Movie> moviesadded(){

        List<Movie>res=mop.moviesadded();

        return res;
    }

    public void deleteDirectorMovie(Director d){

        mop.deleteDirectorMovie(d);
    }

}
