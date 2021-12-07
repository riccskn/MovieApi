package com.portifolio.movie.repository;

import com.portifolio.movie.model.MovielModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<MovielModel, String> {



}
