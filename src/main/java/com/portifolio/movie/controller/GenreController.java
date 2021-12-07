package com.portifolio.movie.controller;

import com.portifolio.movie.model.GenreModel;
import com.portifolio.movie.model.MovielModel;
import com.portifolio.movie.service.GenreService;
import com.portifolio.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/genres")
public class GenreController {

    @Autowired
    private GenreService service;


    @PostMapping()
    public void createGenre(@RequestBody GenreModel genre) {
        service.createGenre(genre);
    }

    @GetMapping()
    public ResponseEntity<List<GenreModel>> allGenres() {

        return new ResponseEntity<>(service.getAllGenres(), HttpStatus.FOUND);

    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreModel> getGenreById(@PathVariable("id") String id) {

        return new ResponseEntity<>(service.getGenreById(id), HttpStatus.FOUND);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenreById(@PathVariable("id") String id) {

        service.deleteGenreById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);

    }

}
