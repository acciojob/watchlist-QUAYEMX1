package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/movies")

 public class movieController {

  movieService mos=new movieService();
  @PostMapping("/add-movie")
  public ResponseEntity addMovie(@RequestBody Movie m){

      mos.addMovie(m);

      return new ResponseEntity<>("Movie added successfully!", HttpStatus.OK);
  }


  @PostMapping("/add-director")
    public ResponseEntity addDirector(@RequestBody Director d){

      mos.addDirector(d);
      return new ResponseEntity<>("Director added successfully",HttpStatus.OK);
  }

 @GetMapping("/get-movie-by-name/")
    public ResponseEntity getMovie(@RequestParam("moviesName")String movieName){

      Movie m=mos.getMovie(movieName);

      return new ResponseEntity<>(m,HttpStatus.OK);
  }

    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity getDirector(@PathVariable("directorName")String directorName){

        Director d=mos.getDirector(directorName);

        return new ResponseEntity(d,HttpStatus.OK);
    }

//   @GetMapping("/get-movies-by-director-name/{director}")
//    public ResponseEntity getMovieDirectorName(@PathVariable("directorName")String directorName){
//       List<Movie>m=mos.getMovieDirectorName(directorName);
//   }


}

