package com.driver.controller;

import com.driver.Entities.Director;
import com.driver.Entities.Movie;
import com.driver.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class movieController {

    @Autowired
    movieService mos;


    @PostMapping("/add-movie")
    public void addMovie(@RequestBody Movie movie){

        mos.addMovie(movie);
    }

    @PostMapping("/add-director")
    public void addDirector(@RequestBody Director director){
        mos.addDirector(director);
    }

    @PutMapping("/add-movie-director-pair")
    public void pairmovieDirector(@RequestParam("movieName") String movieName,
                                  @RequestParam("directorName")String directorName){
        mos.updatelist(movieName,directorName);
    }

    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity getmoviebyname(@PathVariable("name")String moviename){

        return new ResponseEntity<>(mos.getMovie(moviename), HttpStatus.OK);
    }

    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity<Director> getdirectorbyname(@PathVariable("name")String name){

        return new ResponseEntity<>(mos.getDirector(name),HttpStatus.OK);
    }


    @GetMapping("/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> listmoviename(@RequestParam("director")String name){

        return new ResponseEntity<>(mos.movisnamewithdirector(name),HttpStatus.OK);
    }

    @GetMapping("/get-all-movies")
    public ResponseEntity<List<Movie>> listofAllmovie(){

        return new ResponseEntity<>(mos.listmovie(),HttpStatus.OK);
    }

    @DeleteMapping("/delete-director-by-name")
    public void deletedirector(@RequestParam("directorName")String directorName){

        mos.deletemovidirector(directorName);
    }

    @DeleteMapping("/delete-all-directors")
    public void deleteallrecords(){
        mos.delteallmoviedirector();
    }
}
