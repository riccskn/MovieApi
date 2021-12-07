package com.portifolio.movie.controller;

import com.portifolio.movie.model.MovielModel;
import com.portifolio.movie.repository.MovieRepository;
import com.portifolio.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService service;


  @PostMapping()
    public void createPerson(@RequestBody MovielModel movie) {
      service.createMovie(movie);
  }

  @GetMapping()
     public ResponseEntity<List<MovielModel>> allMovies(@RequestParam(name = "kids") String kids)  {

      System.out.println("Value é "+kids);

      if (kids == null) {

          return new ResponseEntity<>(service.getAllMovies(), HttpStatus.FOUND);

      }else {

          return new ResponseEntity<>(service.filterHandler(Boolean.parseBoolean(kids)), HttpStatus.FOUND);

      }

  }

   @GetMapping("/{id}")
    public ResponseEntity<MovielModel> getMovieById(@PathVariable("id") String id) {

      return new ResponseEntity<>(service.getMovieById(id), HttpStatus.FOUND);

   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteMovieById(@PathVariable("id") String id) {

      service.deleteMovieById(id);

       return new ResponseEntity<Void>(HttpStatus.OK);

   }

}
