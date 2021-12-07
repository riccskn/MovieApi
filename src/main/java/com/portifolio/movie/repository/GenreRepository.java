package com.portifolio.movie.repository;

import com.portifolio.movie.model.GenreModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository<GenreModel, String> {

    public GenreModel findByName(String name);

}
