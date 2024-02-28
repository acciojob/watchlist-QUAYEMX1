package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class movieRepository {

  HashMap<Movie,Integer>mp=new HashMap<>();

  HashMap<Director,Integer>mp1=new HashMap<>();

  HashMap<Movie,Director>mp2=new HashMap<>();




   public void addMovie(Movie movie){

     if(mp.containsKey(movie)==false){
        mp.put(movie,1);
    }
  }

    public void addDirector(Director director){

        if(mp1.containsKey(director)==false){
            mp1.put(director,1);
        }
    }

  // making for betterment
   public List<Director> getAllDirector(){
       List<Director>listofAllDirector=new ArrayList<>();

       for(Director d:mp1.keySet()){
           listofAllDirector.add(d);
       }

       return listofAllDirector;
   }



    public List<Movie> getMovie(Director name){

       List<Movie>listofAllMovie=new ArrayList<>();
       for(Movie m:mp2.keySet()){
           if(mp2.get(m)==name){
               listofAllMovie.add(m);
           }
       }

       return listofAllMovie;
    }

    public List<Movie> moviesadded(){
       List<Movie>final1=new ArrayList<>();

       for(Movie m:mp.keySet()){
           final1.add(m);
       }

       return final1;
    }


    public void deleteDirectorMovie(Director d){
       for(Movie m:mp.keySet()){
           if(mp2.get(m)==d){
               mp.remove(m);
           }
       }
    }


}
