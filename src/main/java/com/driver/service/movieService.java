package com.driver.service;

import com.driver.Entities.Director;
import com.driver.Entities.Movie;
import com.driver.repository.movieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class movieService {

    @Autowired
    movieRepository mop;

    public void addMovie(Movie movie){
          mop.addMovie(movie);
    }

    public void addDirector(Director director){
        mop.addDirector(director);
    }

    public Movie getMovie(String moviem){

        List<Movie>res=mop.allMovie();
        Movie newm=null;

        for(Movie m2:res){
            if(m2.getMovieName().equals(moviem)){
                newm=m2;
            }
        }
        return newm;
    }

    public Director getDirector(String directorm){

        List<Director>res=mop.allDirector();
        Director newm=null;

        for(Director d2:res){
            if(d2.getDirectorName().equals(directorm)){
                newm=d2;
            }
        }
        return newm;
    }

    public void  updatelist(String name1, String director){

        mop.updatelist(name1,director);
    }

    public List<String> movisnamewithdirector(String directorname){

        HashMap<Movie,Director>mp=mop.allmovieDirector();

        List<String>ans=new ArrayList<>();

        for(Movie m:mp.keySet()){
           if(mp.get(m).getDirectorName().equals(directorname)){
               ans.add(m.getMovieName());
           }
        }
        return ans;
    }

    public List<Movie>  listmovie(){

        return mop.allMovie();
    }

    public void deletemovidirector(String dirName){
        List<Movie>m1=mop.allMovie();
        List<Director>m2=mop.allDirector();
        HashMap<Movie,Director>m3=mop.allmovieDirector();

       Movie mname=null;
       Director dname=null;

        for(Movie m:m3.keySet()){
            if(m3.get(m).getDirectorName().equals(dirName)){
                mname=m;
                dname=m3.get(m);
            }
        }

        m1.remove(mname);
        m2.remove(dname);
        m3.remove(mname);
    }

    public void delteallmoviedirector(){
        List<Movie>m1=mop.allMovie();
        List<Director>m2=mop.allDirector();
        HashMap<Movie,Director>m3=mop.allmovieDirector();

        for(Movie m:m3.keySet()){
            m1.remove(m);
            m2.remove(m3.get(m));
            m3.remove(m);
        }
    }
}
