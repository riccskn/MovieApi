package com.portifolio.movie.service;

import com.portifolio.movie.exception.EntityNotFoundException;
import com.portifolio.movie.model.GenreModel;
import com.portifolio.movie.model.MovielModel;
import com.portifolio.movie.repository.GenreRepository;
import com.portifolio.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private GenreRepository genreRepository;

    public MovieService() {

    }

    public void createMovie(MovielModel movielModel) {

        GenreModel genre = genreRepository.findByName(movielModel.getGenre());

        if (genre != null) {

            repository.save(movielModel);

        }else {

            throw new EntityNotFoundException("Not found genre with name: "+movielModel.getGenre());

        }

    }

    public List<MovielModel> getAllMovies() {

       return repository.findAll();

    }

    public List<MovielModel> filterHandler(boolean forKids) {

        List<MovielModel> result = new ArrayList<>();

        repository.findAll().forEach(moviel -> {

            GenreModel genreModel = genreRepository.findByName(moviel.getGenre());

            if (genreModel.isForKids() == forKids) {

                result.add(moviel);

            }

        });

        return result;

    }

    public MovielModel getMovieById(String id) {

        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not found movie with Id "+id));

    }

    public void deleteMovieById(String id) {

    MovielModel movielModel = repository.findById(id).orElseThrow(() -> new EntityNotFoundException(("Not found movie with Id "+id)));

       repository.delete(movielModel);

    }

    public void updateMovieById(String id, MovielModel movie) {

        repository.findById(id).orElseThrow(() -> new EntityNotFoundException(("Not found movie with Id "+id)));

        repository.save(movie);

    }


}
