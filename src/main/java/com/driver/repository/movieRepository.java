package com.driver.repository;

import com.driver.Entities.Director;
import com.driver.Entities.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class movieRepository {

    List<Movie>m=new ArrayList<>();
    List<Director>d=new ArrayList<>();

    HashMap<Movie,Director>hmd=new HashMap<>();

    public void addMovie(Movie movie){
        m.add(movie);
    }

    public void addDirector(Director director){
        d.add(director);
    }

    public List<Movie> allMovie(){
        return m;
    }

    public List<Director> allDirector(){
        return d;
    }

    public void  updatelist(String name1,String name2){

        Movie mm=null;
        Director dd=null;

        for(Movie mm1:m){
            if(mm1.getMovieName().equals(name1)){
                mm=mm1;
            }
        }

        for(Director dd1:d){
            if(dd1.getDirectorName().equals(name2)){
                dd=dd1;
            }
        }

        hmd.put(mm,dd);
    }


    public HashMap<Movie,Director> allmovieDirector(){
        return hmd;
    }


}
