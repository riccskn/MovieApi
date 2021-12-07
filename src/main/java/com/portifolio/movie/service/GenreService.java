package com.portifolio.movie.service;

import com.portifolio.movie.exception.EntityNotFoundException;
import com.portifolio.movie.exception.EntityAlreadyExists;
import com.portifolio.movie.model.GenreModel;
import com.portifolio.movie.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository repository;

    public void createGenre(GenreModel model) {

        GenreModel search = repository.findByName(model.getName());

        if (search == null) {

            repository.save(model);

        }else {

            throw new EntityAlreadyExists("This genre already exists");

        }

    }

    public GenreModel getGenreById(String id) {

        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not found genre with Id"+id));

    }

    public void deleteGenreById(String id) {

        GenreModel genreModel = repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Not found genre with Id "+id)
        );

        repository.delete(genreModel);
        
    }

    public List<GenreModel> getAllGenres() {

        return repository.findAll();

    }

    public void updateGenreById(String id, GenreModel movie) {

        repository.findById(id).orElseThrow(() -> new EntityNotFoundException(("Not found movie with Id "+id)));

        repository.save(movie);

    }



}
